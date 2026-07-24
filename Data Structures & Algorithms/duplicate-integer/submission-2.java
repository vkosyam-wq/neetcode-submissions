class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> myHash = new HashMap<>();
        int counter = 0;
        for(int number : nums)
        {
            if(myHash.containsKey(number))
            {
                return true;
            }
            myHash.put(number,0);
        }
        return false;

        
    }
}