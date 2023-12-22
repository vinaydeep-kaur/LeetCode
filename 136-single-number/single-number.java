import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i+1]=-1;
            }
        }

        for(int i : nums){
            if(i!=-1){
                return i;
            }
        }
        return -1;
}}