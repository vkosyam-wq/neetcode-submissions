class Solution {
    public int evalRPN(String[] tokens) {
        
        int n = tokens.length;
        Stack<Integer> tokenStack = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            
            String token = tokens[i];
            if(token.equals("+"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(a + b);
                continue;
                

            }
            
            if(token.equals("-"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(b - a);
                continue;
                

            }

            if(token.equals("*"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(a * b);
                continue;
                

            }

            if(token.equals("/"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(b / a);
                continue;
                

            }
            else
            {
                tokenStack.push(Integer.parseInt(token));
            }

            

            

            
            
        
        }
        return tokenStack.pop();
    }
}
