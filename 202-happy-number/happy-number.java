class Solution {
    public boolean isHappy(int n) {
        //n =19
        HashSet<Integer> seen = new HashSet<>();

        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getSumOfDigit(n);

        }

        return n==1;
    }


    private int getSumOfDigit(int n){
        int sum =0;
        while(n>0){
            int digit = n % 10;
            sum += digit*digit;
            n = n/10;
        }
        return sum;
    }
}