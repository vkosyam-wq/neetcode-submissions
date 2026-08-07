class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> myS = new HashMap<>();
        
        for(String word : strs)
        {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            myS.putIfAbsent(key, new ArrayList<>());
            myS.get(key).add(word);
        }

        return new ArrayList<>(myS.values());

        

    

        
        
        
                
    }
}
