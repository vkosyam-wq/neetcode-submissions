class Solution {
    public int minOperations(String[] logs) {
        int minOp = 0;
        Stack<String> logsStack = new Stack<>();

        for(String folderOp : logs)
        {
            logsStack.push(folderOp);
            if(logsStack.peek().equals("../") && minOp == 0) continue;

            if(logsStack.peek().equals("./")) continue;

            if(logsStack.peek().equals("../"))
            {
                minOp--;
                logsStack.pop();
            }

            else{
                minOp++;
                logsStack.pop();
            }




           

           
        
        }
        return minOp;
        
    }
}