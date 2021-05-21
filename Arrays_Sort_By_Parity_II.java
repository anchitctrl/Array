class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0; 
        int j = nums.length - 1;
        int[] result = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                result[i]=nums[k];
                i=i+2;
            }
            else{
                result[j]=nums[k];
                j=j-2;
            }
        }
        return result;
    }
}
