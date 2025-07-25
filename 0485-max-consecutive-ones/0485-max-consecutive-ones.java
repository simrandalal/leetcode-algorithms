class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int currentCount=0;
        int maxCount=0;

        for(int num : nums){
            if(num==1){
                currentCount++;
            }
            else{
                maxCount = Math.max(maxCount ,currentCount);
                currentCount = 0;
            }
        }
        maxCount = Math.max(maxCount ,currentCount);

        return maxCount;
        
    }
}