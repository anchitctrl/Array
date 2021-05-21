class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int left=fib(n-2);
        int right=fib(n-1);
        return left+right;
    }
}
