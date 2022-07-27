package com.company.Interview;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2, 4,8, 8, 8, 12, 14};
//        System.out.println(indexOf(arr, 8));

//        System.out.println(indexOfByRecursion(arr, 16));

        System.out.println(search(arr, 1));
        System.out.println(search(arr, 15));
        System.out.println(search(arr, 8));



    }

    public static int indexOf(int[] arr, int v){
        if (arr == null || arr.length == 0) return -1;

            //有范围，就一定有左区间，右区间
            //取区间，最好左闭右开
            // mid = (begin + end)/2
        int begin = 0;
        int end = arr.length;

        while (begin < end){

            int mid = (begin + end)/2; // 注意mid 计算的位置；
            if (arr[mid] < v){
                begin = mid + 1;
            }else if (arr[mid] > v){
                end = mid;
            }else {
                return mid;
            }
        }

        return -1;

    }



    /**
     * 通过二分查找查询v在数组中的索引
     * @param arr
     * @param v
     * @return index
     */

    public static int indexOfByRecursion(int[] arr, int v) {
        if (arr == null || arr.length == 0) return -1;

        return indexOfByRecursion(arr,0, arr.length, v);
    }

    // 需要马甲函数；增强原函数的参数

    /**
     * 在[begin, end)区间通过二分查找查询v在数组中的索引
     * @param arr
     * @param begin
     * @param end
     * @param v
     * @return index
     */
    private static int indexOfByRecursion(int[] arr, int begin, int end, int v){

        if (begin <= end && begin < arr.length){
            int mid = begin + (end - begin)/2; // int mid = (begin + end) >> 1;

            if (arr[mid] == v) return mid;

            if (arr[mid] > v)  return indexOfByRecursion(arr, begin, mid - 1, v);

            else return indexOfByRecursion(arr, mid + 1, end, v);
        }

        return -1;

    }


    /**
     * 利用binary search, 来找到某个值想插入进一个有序数组的位置应该在哪里
     * @param arr
     * @param v
     * @return 值应该插入的位置
     */

    public static int search(int[] arr, int v){

        if (arr == null || arr.length == 0){
            return -1;
        }
        int begin = 0;
        int end = arr.length;

        while (begin < end){
            int mid = (begin + end) >> 1;
            if (v < arr[mid]){
                end = mid;
            }else {
                begin = mid + 1;
            }
        }

        return begin;//返回end也一样
    }
    }



