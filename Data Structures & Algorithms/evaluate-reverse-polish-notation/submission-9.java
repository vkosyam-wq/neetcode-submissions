class Solution {
    public int evalRPN(String[] tokens) {
        
        int n = tokens.length, sum = 0;
        Stack<Integer> tokenStack = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            
            String token = tokens[i];
            if(token.equals("+"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                sum = a + b;
                tokenStack.push(sum);
                

            }
            
            else if(token.equals("-"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(b - a);
                

            }

            else if(token.equals("*"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(a * b);
                

            }

            else if(token.equals("/"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                tokenStack.push(b / a);
                

            }
            else
            {
                tokenStack.push(Integer.parseInt(token));
            }

            

            

            
            
        
        }
        return tokenStack.pop();
    }
}
