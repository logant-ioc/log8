package com.log8;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (null==nums) {
            return 0;
        }
        int i = 0;
        for (int j=1;j<nums.length;j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        Solution26 s26 = new Solution26();
        int result = s26.removeDuplicates(nums);
        System.out.println(result);
        for(int i=0;i<result;i++){
            System.out.println(i +"--" +nums[i]);
        }

    }
}
