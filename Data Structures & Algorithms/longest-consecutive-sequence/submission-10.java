class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int slow = 0;
        int longest = 1;
        int duplicates = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            // skip duplicates
            if (nums[fast] == nums[fast - 1]) {
                duplicates++;
                continue;
            }

            // consecutive
            if (nums[fast] == nums[fast - 1] + 1) {
                // still in the same streak
                longest = Math.max(longest, fast - slow + 1 - duplicates);
            } 
            else {
                // streak broken → move slow to fast
                slow = fast;
                duplicates = 0;
            }
        }

        return longest;
    }
}