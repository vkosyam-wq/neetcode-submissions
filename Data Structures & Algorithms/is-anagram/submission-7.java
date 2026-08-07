class Solution {
    public boolean isAnagram(String s, String t) {

        char[] myCharS = s.toCharArray();
        char[] myCharT = t.toCharArray();

        Arrays.sort(myCharS);
        Arrays.sort(myCharT);

        return Arrays.equals(myCharS, myCharT);
        

    }
}
