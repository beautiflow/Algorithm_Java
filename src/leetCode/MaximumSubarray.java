package leetCode;

public class MaximumSubarray {
    public static void main(String[] args) throws Exception {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(curSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;

    }

}


