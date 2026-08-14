class Solution {
    public int minOperations(String[] logs) {
        int minOp = 0;
        for(String log : logs)
        {
            if(log.equals("../") && minOp == 0 || log.equals("./")) continue;

            if(log.equals("../")) minOp--;

            else minOp++;

        }
        return minOp;
    }
}