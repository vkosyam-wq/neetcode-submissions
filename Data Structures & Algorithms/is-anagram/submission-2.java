class Solution {
    public boolean isAnagram(String s, String t) {
        int counterS = 1;
        int counterT = 1;

        HashMap<String,Integer> sHash = new HashMap<>();
        HashMap<String,Integer> tHash = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }
        for(int i = 0; i < s.length();i++)
        {
            String key = s.substring(i,i+1);
            if(sHash.containsKey(key))
            {
                sHash.put(key,sHash.get(key)+1);
            }
            else{
                sHash.put(key,counterS);
            }
        }

        for(int i = 0; i < t.length(); i++)
        {
            String tSh = t.substring(i,i+1);

            if(tHash.containsKey(tSh))
            {
                tHash.put(tSh,tHash.get(tSh) + 1);
            }
            else{
                tHash.put(tSh,counterT);
            }
        }
        System.out.println(tHash);
        System.out.println(sHash);
        for(Map.Entry<String,Integer> entry : sHash.entrySet())
        {
            String sString = entry.getKey();
            Integer sInteger = entry.getValue();
            if (!tHash.containsKey(sString)) return false;
            if (!tHash.get(sString).equals(sInteger)) return false;
        }
        return true;

        
    }

}
