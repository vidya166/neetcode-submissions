class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;

    }
}
/*
We can simplify the binary search by using l < r as the loop condition 
instead of l <= r. This eliminates extra boundary checks. By always 
comparing mid with mid + 1, we ensure we move toward a peak. 
When l == r, we have found the peak without needing additional checks.
*/