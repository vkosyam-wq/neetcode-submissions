class StockSpanner {

    private Stack<int[]> arStack;

    public StockSpanner() {
        this.arStack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        List<int[]> list = new ArrayList<>();
        while(!arStack.empty() && arStack.peek()[0] <= price)
        {
            list.add(arStack.pop());
            span++;
        }
        for(int[] number : list) arStack.push(number);
        int[] priceAr = new int[1];
        priceAr[0] = price;
        arStack.push(priceAr);
        return span;
    }
}
