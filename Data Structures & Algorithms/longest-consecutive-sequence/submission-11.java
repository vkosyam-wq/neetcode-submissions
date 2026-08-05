class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        int longest = 0;

        for(int number : nums)
        {
            numsSet.add(number);
        }
        System.out.println(numsSet);
        
        for(Integer number : numsSet)
        {
            if(!(numsSet.contains(number - 1)))
            {
                int counter = 1;

                while(numsSet.contains(number + 1))
                {
                    number++;
                    counter++;
                }

                longest = Math.max(counter,longest);
            }
        }
        return longest;
    }
}
