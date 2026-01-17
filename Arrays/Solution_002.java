package Leetcode.Arrays;

public class Solution_002 {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        while(i <= j){
            if(nums[i] != val){
                i++;
            }
            else if(nums[j] == val){
                j--;
            }
            else {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            }
        }
        return i;
    }
}