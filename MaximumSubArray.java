class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        
        for(int i: nums){
            if(sum<0){
                sum=0;
            }
            sum=sum+i;
            max=Math.max(max,sum);
        }
        return max;
    }
}
