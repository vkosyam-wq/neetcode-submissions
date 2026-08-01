class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        HashMap<Integer,Integer> counterHash = new HashMap<>();
        int[] newArray = new int[k];
        for(int number : nums)
        {
            counterHash.put(number,counterHash.getOrDefault(number,0) + 1);
        }

        System.out.println(counterHash);

        List<Integer> sortedKeys = new ArrayList<>(counterHash.keySet());
        sortedKeys.sort((a, b) -> counterHash.get(b) - counterHash.get(a));
        
        for(int i = 0; i < k; i++)
        {
            newArray[i] = sortedKeys.get(i);
        }

        return newArray;
        
    }
}
