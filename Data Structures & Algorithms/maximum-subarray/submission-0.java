class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int curSum=nums[0];

        for(int i=1; i < nums.length;i++){
            curSum=Math.max(nums[i],curSum+nums[i]);
            maxSum=Math.max(maxSum,curSum);
            // curSum+=nums[i];
            // if(curSum>maxSum){
            //     maxSum=curSum;
            // }
            // if(curSum<0){
            //     curSum=0;
            // }
        }
        return maxSum;
    }
}