package Leetcode.Arrays;

public class Solution_006 {
    public void rotate(int[] nums, int k) {
        int[] arr = nums.clone();
        k = k % nums.length;
        if(k == 0) return;
        k = nums.length - k;
        for(int i = 0; i < nums.length; i++){
            nums[i] = arr[k];
            k = (k + 1) % nums.length;
        }
    }
}