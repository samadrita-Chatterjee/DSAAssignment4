package in.ineuron.exampl;

class Solution {
    public int arrangeCoins(int n) {
        return helper(n);
    }
    
    private int helper(int n){
        long l=1;
        long r=n;
        long res=0;
        
        while(l<=r){
            long mid = l+(r-l)/2;
            long sum = ((mid)*(mid+1))/2;
            if(sum>n){
                r=mid-1;
            }else{
                l=mid+1;
                res=Math.max(res,mid);
            }
        }
        
        return (int)res;
    }
}