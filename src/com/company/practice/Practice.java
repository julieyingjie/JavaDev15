package com.company.practice;

public class Practice {

    public static void main(String[] args) {

//        decimalNumberToBinaryNumber(20);

//        binaryNumberToDecimalNumber(10011);

//       int[] reversedArray =  reverseArray(new int[] {1,2,3,4,5});
//        for (int element: reversedArray ) {
//            System.out.print(element + " ");
//        }

        int[] array = new int[]{0,1,2,1,0};
        sortColors(array, 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }


    }

    public static void decimalNumberToBinaryNumber(long decimalNumber){
        int binary[] = new int[40];
        int index = 0;

        while(decimalNumber > 0){
            binary[index] = (int) (decimalNumber%2);
            index++;
            decimalNumber = decimalNumber/2;
        }

        for (int i = binary.length - 1; i != 0 ; i--) {
            System.out.print(binary[i]);
        }

        System.out.println();
    }

    public static void binaryNumberToDecimalNumber(long binaryNumber){

        int decimal = 0;
        int n = 0;

        while(true){
            if (binaryNumber == 0){
                break;
            }else {
                int temp = (int) (binaryNumber % 10);
                decimal += temp * Math.pow(2, n);
                binaryNumber = binaryNumber / 10;
                n++;
            }
        }

        System.out.print(decimal);

    }

    //[12735] -----> [53721]

    public static int[] reverseArray1(int[] arr){

        // 先对参数做判断
        if (arr == null || arr.length == 0){
            return null;
        }
        if (arr.length == 1){
            return arr;
        }
        int[] reverseArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i != -1 ; i--, j++) {
                reverseArr[j] = arr[i];
            }
        return reverseArr;
    }
    
    //对于数组，我们首选操作数组下标。不要操作值，因为值有可能重复。
    //用一种不需要创造新数组的方式来reverseArray

    // 首先需要一个swap方法；
    private static void swap(int[] arr, int i, int j){
        //内部方法一般不需要判断参数
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // 步骤： 将数组中0号位和最后一位调换，1号位和倒数第二位调换，以此类推。
    public static int[] reverseArray(int[] arr){

        // 先对参数做判断
        if (arr == null || arr.length == 0){
            return null;
        }
        if (arr.length == 1){
            return arr;
        }
       int i = 0, j = arr.length - 1;
        while (i < j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;

            swap(arr,i,j);
            //这一步非常重要。数组需要保留一下，交换过的数值。

            i++;
            j--;
        }

        return arr;

    }


    // abcd ----> dcba
    public static String reverseString(String str){
        if (str == null || str.length()== 0) return null;
        if (str.length()==1) return str;

        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j){
            swap1(chars, i, j);
            i++;
            j--;
        }

        return  String.copyValueOf(chars);
    }

    private static void swap1(char[] arr, int i, int j){
        //内部方法一般不需要判断参数
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortColors(int[] nums){

        sortColors(nums, 1);
    }


    public static void sortColors(int[] arr, int pivot){
        int current = 0, right = arr.length, left = -1;
        while (current < right){
            if (arr[current] > pivot){
                swap(arr, current, --right);
            }else if (arr[current] < pivot){
                swap(arr, ++left, current++);
            }else {
                current++;
            }
        }
    }

//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }


    }

