package com.log8;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(null==nums1) {
            return;
        }
        if(null==nums2) {
            return;
        }
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(nums1[i]>nums2[j]){
                int tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;
                i++;
            }else {
                if(nums1[i]==0){
                    nums1[i] = nums2[j];
                    j++;
                    i++;
                }else{
                    i++;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = nums1.length;
        int n = nums2.length;
        Solution88  ss = new Solution88();
        ss.merge(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(i + "---" + nums1[i]);
        }
    }
}













