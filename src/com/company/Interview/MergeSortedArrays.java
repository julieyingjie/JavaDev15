package com.company.Interview;
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
// and two integers m and n, representing the number of elements in nums1 and nums2
// respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function,
// but instead be stored inside the array nums1.
// To accommodate this, nums1 has a length of m + n,
// where the first m elements denote the elements that should be merged,
// and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class MergeSortedArrays {
    // 2个有序数组合成

    public void merge(int[] nums1, int m, int[] nums2,  int n){

       if (nums1 == null || nums1.length ==0 || nums2 == null || nums2.length == 0) return;

       int i1 = m - 1;
       int i2 = n - 1;

       int cur = nums1.length - 1;

       


//
//        while (i < m && j < n){
//
//        }


    }


}
