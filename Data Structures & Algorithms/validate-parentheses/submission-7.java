class Solution {
    public boolean isValid(String s) {
        Stack<String> sStack = new Stack<>();
        int first = 0, last = 1;
        HashMap<String,String> myHash = new HashMap<>();
        myHash.put("(",")");
        myHash.put("[","]");
        myHash.put("{","}");

        for(int i = 0; i < s.length(); i++)
        {
            String letter = s.substring(i,i+1);
            if(myHash.containsKey(letter)) sStack.push(letter);
            else if(myHash.containsValue(letter))
            {
                if(sStack.empty()) return false;

                else if(!myHash.get(sStack.peek()).equals(letter)) return false;

                else{
                    sStack.pop();
                }
            }
        }
        System.out.println(sStack);
        return sStack.empty();


       
    }
}
