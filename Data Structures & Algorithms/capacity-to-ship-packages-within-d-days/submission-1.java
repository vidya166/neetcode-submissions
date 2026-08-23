class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Arrays.stream(weights).max().getAsInt();
        int right=0;
        for(int weight:weights){
            right+=weight;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int daysNeeded=1,currWeight=0;
            for(int weight:weights){
                if(currWeight+weight>mid){
                    daysNeeded++;
                    currWeight=0;
                }
                currWeight+=weight;
            }
            if(daysNeeded>days){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}