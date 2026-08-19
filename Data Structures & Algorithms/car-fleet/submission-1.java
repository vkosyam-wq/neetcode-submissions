class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length, m = speed.length;

        double[][] posSpeed = new double[n][2];
        for(int i = 0; i < n; i++)
        {
            posSpeed[i][0] = position[i];
            posSpeed[i][1] = speed[i];
        }
        

        Arrays.sort(posSpeed, (a,b) -> Double.compare(a[0],b[0]));


        Stack<Double> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--)
        {
            double positionNow = posSpeed[i][0], speedNow = posSpeed[i][1];
            double time = (target - positionNow) / speedNow;

            if(stack.empty() || time > stack.peek())
            {
                stack.push(time);
            }
            

        }
        return stack.size();


    }
}
