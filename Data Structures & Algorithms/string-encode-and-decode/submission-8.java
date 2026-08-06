class Solution {

    public String encode(List<String> strs) {

        StringBuilder sp = new StringBuilder();

        for(String word : strs)
        {
            sp.append(word.length()).append("#").append(word);
        }
        System.out.println(sp.toString());
        return sp.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStr = new ArrayList<>();

        int i = 0;

        while(i < str.length())
        {
            int j = i;

            while(str.charAt(j) != '#')
            {
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            j++;

            String adder = str.substring(j,j+length);
            decodedStr.add(adder);
            i = j + length;


        }
        return decodedStr;
    }
}
