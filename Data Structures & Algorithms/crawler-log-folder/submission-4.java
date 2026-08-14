class Solution {
    public int minOperations(String[] logs) {
       
        int minOp = 0;
        for(String folderOp : logs)
        {
            if(folderOp.equals("../") && minOp == 0) continue;

            if(folderOp.equals("./")) continue;

            if(folderOp.equals("../")) minOp--;

            else minOp++;

        }
        return minOp;
        
    }
}