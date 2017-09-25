import java.util.HashMap;

/**
 * Created by zfhuo on 9/22/17.
 */
public class TwoSum {
    /*public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length -1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }*/

    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int flag = target - nums[i];
            if (map.containsKey(flag) && map.get(flag) != i) {
                result[0] = i;
                result[1] = map.get(flag);
                return result;
            }
        }
        return result;
    }

    public int[] twoSumSorted(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum > target){
                right --;
            } else if (sum < target) {
                left ++;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
