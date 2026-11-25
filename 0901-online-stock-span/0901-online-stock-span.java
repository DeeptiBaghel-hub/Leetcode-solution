class StockSpanner {
     List<Integer> li=new ArrayList<>();
    public StockSpanner() {
      
    }
    
    public int next(int price) {
        li.add(price);
        int c=1;
        for(int i=li.size()-2;i>=0;i--){
            if(li.get(i)<=price) c++;
            else break;
        }
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */