class Solution {
    public boolean isAnagram(String s, String t) {
       
        HashMap<Character,Integer> sHash = new HashMap<>();
        HashMap<Character,Integer> tHash = new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }

        for(int i = 0; i < s.length(); i++)
        {
            sHash.put(s.charAt(i),sHash.getOrDefault(s.charAt(i),0)+1);
            tHash.put(t.charAt(i), tHash.getOrDefault(t.charAt(i), 0) + 1);
        }
        return (sHash.equals(tHash));

        
    }

}
