package leetCode;

public class MaximumSubarray {
    public static void main(String[] args) throws Exception{

        int[] nums = new int[]{-2,1};

       int result = maxSubArray(nums);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        } else if(nums.length == 2){
            maxSum = Math.max(Math.max(nums[0], nums[0]+nums[1]), nums[1]);
            return maxSum;
        }
        else {
            for(int i = 0; i < nums.length-1 ; i++){
                int curSum = 0;
                int curMaxSum = Integer.MIN_VALUE;
                curSum += nums[i];
                for(int j = i+1; j < nums.length; j++){
                    curSum += nums[j];
                    if(curMaxSum < curSum){
                        curMaxSum = curSum;
                    }
                }
                maxSum = Math.max(maxSum, Math.max(curMaxSum, nums[i]));
            }
            if(maxSum < nums[nums.length-1]){
                maxSum = nums[nums.length-1];
            }
            return maxSum;
        }



    }
}


