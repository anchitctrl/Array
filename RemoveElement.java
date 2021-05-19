class Solution {
    public int removeElement(int[] nums, int val) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[s]=nums[i];
                s++;
            }
        }
        
        return s;
    }
}
