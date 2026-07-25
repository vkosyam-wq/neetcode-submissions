class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> myHashMap = new HashMap<>();
        int[] sumArray = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int difference = target-nums[i];
            if(!(myHashMap.containsKey(difference)))
            {
                myHashMap.put(nums[i],i);
            }
            else{
                sumArray[0] = myHashMap.get(target-nums[i]);
                sumArray[1] = i;
                return sumArray;
            }

        }
        return sumArray;
        
    }
}
