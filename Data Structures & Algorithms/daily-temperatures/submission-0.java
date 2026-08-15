class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
       int[] result = new int[temperatures.length];
       Stack<Integer> indStack = new Stack<>();

       for(int i = 0; i < temperatures.length; i++)
       {
            while(!indStack.empty() && temperatures[i] > temperatures[indStack.peek()])
            {
                int prevIndex = indStack.pop();
                result[prevIndex] = i - prevIndex;
            }

            indStack.push(i);
       }
       return result;




       

    }
}
