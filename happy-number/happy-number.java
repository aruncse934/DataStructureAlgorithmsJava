class Solution {
    public boolean isHappy(int n) {
    Set<Integer> seen  = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n);
        }
        return n==1;
    }
    private int getNext(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem*rem;
            num /= 10;
        }
        
        return sum;
    }
}
  
