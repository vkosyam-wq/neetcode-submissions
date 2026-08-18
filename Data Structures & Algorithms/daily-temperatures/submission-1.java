class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> tempStack = new Stack<>();
        int n = temperatures.length;
        int[] nextGreatAr = new int[n];
        for(int i = 0; i < n; i++)
        {
            int temperature = temperatures[i];

            while(!tempStack.empty() && temperature > temperatures[tempStack.peek()])
            {
                int prevIndex = tempStack.pop();
                nextGreatAr[prevIndex] = i - prevIndex;
                

            }
            tempStack.push(i);
        }

        return nextGreatAr;
       




       

    }
}
