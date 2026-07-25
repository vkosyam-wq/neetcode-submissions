class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArray = new int[2];
        for(int i = 0; i < nums.length - 1; i++)
        {
            int firstInt = nums[i];
            for(int j = i + 1; j < nums.length; j++)
            {
                int secondInt = nums[j];
                if(firstInt + secondInt == target)
                {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }
        return newArray;
    }
}
