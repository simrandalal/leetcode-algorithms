class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentCount=0;
        int maxCount=0;

        for(int num : nums){
            if(num==1){
                currentCount++;
                maxCount = Math.max(maxCount ,currentCount);
            }
            else{
                currentCount = 0;
            }
        }
        return maxCount;
        
    }
}