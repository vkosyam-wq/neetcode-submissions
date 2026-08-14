class Solution {
    public int minOperations(String[] logs) {
        int minOp = 0;
        Stack<String> logsStack = new Stack<>();

        for(String folderOp : logs)
        {
            logsStack.push(folderOp);
            if(logsStack.peek().equals("../"))
            {
                if(minOp > 0){
                    minOp--;
                    logsStack.pop();
                }
                else continue;
            }

            else if(logsStack.peek().equals("./"))
            {
                continue;
            }
            else{
                minOp++;
                logsStack.pop();
            }
        
        }
        return minOp;
        
    }
}