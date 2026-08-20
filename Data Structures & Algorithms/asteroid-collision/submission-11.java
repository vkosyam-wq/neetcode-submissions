class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroidStack = new Stack<>();


        for (int asteroid : asteroids) {

            if (!asteroidStack.empty() && asteroid < 0 && asteroidStack.peek() > 0) {

                while (!asteroidStack.empty() &&
                    asteroidStack.peek() > 0 &&
                    Math.abs(asteroid) > asteroidStack.peek()) {
                    asteroidStack.pop();
                }

                if (!asteroidStack.empty() &&
                    asteroidStack.peek() > 0 &&
                    Math.abs(asteroid) == asteroidStack.peek()) {
                    asteroidStack.pop();
                    continue;
                }

                if (!asteroidStack.empty() &&
                    asteroidStack.peek() > 0 &&
                    Math.abs(asteroid) < asteroidStack.peek()) {
                    continue;
                }
            }

            asteroidStack.push(asteroid);
        }

            


            
        


        int n = asteroidStack.size();

        List<Integer> asteroidList = new ArrayList<>();

        for(int i = 0; i < n; i++) asteroidList.add(0,asteroidStack.pop());

        int[] asteroidResult = new int[n];
        for(int i = 0; i < n; i++) asteroidResult[i] = asteroidList.get(i);
        return asteroidResult;





    }
    
    
}
