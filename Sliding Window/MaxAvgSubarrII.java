public class MaxAvgSubarrII{
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        double windowSum = 0;
        for (int i = 0; i < k ; i++ ){
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        //Slide window to add new element and remove first element
        for (int i = k; i< n ;i++){
            windowSum += nums[i] - nums[i-k];

            maxSum = Math.max(windowSum , maxSum);
        }

        return maxSum / k;   //we need the average sum 
        
    }
}