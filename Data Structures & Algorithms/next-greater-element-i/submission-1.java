class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int target = nums1[i];
            int indexInNums2 = -1;

            // find nums1[i] inside nums2
            for (int j = 0; j < n; j++) {
                if (nums2[j] == target) {
                    indexInNums2 = j;
                    break;
                }
            }

            // scan to the right for next greater
            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < n; k++) {
                if (nums2[k] > target) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}