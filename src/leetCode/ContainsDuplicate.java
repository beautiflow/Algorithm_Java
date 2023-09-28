package leetCode;

public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            int[] arr = new int[nums.length];

            for(int i = 0; i < nums.length; i++){
                arr[i] = nums[i];
                if(nums[i] == arr[i]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }

