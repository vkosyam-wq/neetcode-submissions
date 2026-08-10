class Solution {
    public int pivotIndex(int[] nums) {

       int total = 0, left = 0, right = 0;
       for(int number : nums)
       {
        total+= number;
       } 

       for(int i = 0; i < nums.length; i++)
       {
            if(i > 0) left+= nums[i-1];
            right = total - left - nums[i];
            if(left == right) return i;
       }
       return -1;

        
    }
}