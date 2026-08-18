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
                continue;

            }
            
            if(token.equals("-"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                sum = b - a;
                tokenStack.push(sum);
                continue;

            }

            if(token.equals("*"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                sum = a * b;
                tokenStack.push(sum);
                continue;

            }

            if(token.equals("/"))
            {
                int a = tokenStack.pop();
                int b = tokenStack.pop();
                sum = b / a;
                tokenStack.push(sum);
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
