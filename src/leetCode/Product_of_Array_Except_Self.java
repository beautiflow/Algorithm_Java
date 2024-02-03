package leetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {
        Queue<Integer> list = new LinkedList<>();
        int[] totalNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list.offer(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            list.offer(list.poll());
            int multi = 1;
            int count = 1;
            int count2 = 0;
            while (list.size() - 1 >= count) {
                int sub = list.poll();
                multi *= sub;
                list.offer(sub);
                count++;
            }
            while (list.size() - (list.size() - 1) > count2) {
                list.offer(list.poll());
                count2++;
            }
            totalNum[i] = multi;
        }
        return totalNum;
    }
}

