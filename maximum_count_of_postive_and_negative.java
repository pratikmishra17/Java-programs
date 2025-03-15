import java.lang.*;

public class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                pos++;
            } else if (nums[i] < 0) {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println("Maximum count of positive or negative numbers: " + sol.maximumCount(nums));
    }
}
