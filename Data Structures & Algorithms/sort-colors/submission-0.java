class Solution {
    public void sortColors(int[] nums) {
        // if mid is 0 swap  it with low
        // if mid is 1 increment 1
        // if mid is high sawp it with high
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low++]=nums[mid];
                nums[mid++]=temp;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high--]=temp;
            }
        }
    }
}