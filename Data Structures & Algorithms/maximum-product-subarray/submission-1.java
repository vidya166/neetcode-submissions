class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(curr*maxProd,nums[i]);
            minProd=Math.min(curr*minProd,nums[i]);
            res=Math.max(res,maxProd);
        }
        return res;
    }
}