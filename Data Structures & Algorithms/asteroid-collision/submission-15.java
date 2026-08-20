class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>();


        for(int asteroid : asteroids)
        {
            if(!asteroidStack.empty() && asteroid < 0 && asteroidStack.peek() > 0)
            {
                while(!asteroidStack.empty() && asteroidStack.peek() > 0 && Math.abs(asteroid) > asteroidStack.peek()) asteroidStack.pop();

                if(!asteroidStack.empty() && Math.abs(asteroid) == asteroidStack.peek())
                {
                    asteroidStack.pop();
                    continue;
                }
                if(!asteroidStack.empty() && Math.abs(asteroid) < asteroidStack.peek()) continue;

                
            }

            asteroidStack.push(asteroid);

            


            
        }


        int n = asteroidStack.size();

        int[] resultArray = new int[n];

        for(int i = n - 1; i >= 0; i--) resultArray[i] = asteroidStack.pop();
        return resultArray;






    }
    
    
}
