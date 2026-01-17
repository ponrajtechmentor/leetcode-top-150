package Leetcode.Arrays;

public class Solution_005 {
    public int majorityElement(int[] nums) {
        int val  = nums[0], freq = 1;
        for(int i = 1; i < nums.length; i++){
            if(val == nums[i]){
                freq++;
            }
            else {
                if(freq > 0){
                    freq--;
                }
                else {
                    val = nums[i];
                    freq = 0;
                }
            }
        }
        return val;
    }
}