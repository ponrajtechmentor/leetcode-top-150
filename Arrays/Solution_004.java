package Leetcode.Arrays;

public class Solution_004 {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int i = 0, count = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] == nums[j] && count == 0){
                nums[++i] = nums[j];
                count++;
            }
            else if(nums[i] != nums[j]){
                nums[++i] = nums[j];
                count = 0;
            }
        }
        return i + 1;
    }
}
