class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 1;
        int count = 1, maxCount = 0;
        if(n == 1)
        return 1;
        while(i < n) {
            if(nums[i] - nums[i-1] == 1){
                count++;
            }
            if(count > maxCount)
            maxCount = count;
            if(nums[i] - nums[i-1] !=1 && nums[i] - nums[i-1] != 0)
            count = 1;
            i++;
        }
        return maxCount;
    }
}