import java.util.*;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l = nums.length;
        List<Integer> before = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (nums[i] > pivot) {
                after.add(nums[i]);
            } else if (nums[i] < pivot) {
                before.add(nums[i]);
            } else { // nums[i] == pivot
                equal.add(nums[i]);
            }
        }

        before.addAll(equal);
        before.addAll(after);
        return before.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;
        int[] result = sol.pivotArray(nums, pivot);
        System.out.println("Pivoted array: " + Arrays.toString(result));
    }
}
