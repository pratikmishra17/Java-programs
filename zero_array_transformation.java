import java.util.*;

public class Solution {

    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, sum = 0, k = 0;
        int[] differenceArray = new int[n + 1];

        // Iterate through nums
        for (int index = 0; index < n; index++) {
            // Iterate through queries while current index of nums cannot equal zero
            while (sum + differenceArray[index] < nums[index]) {
                k++;

                // Zero array isn't formed after all queries are processed
                if (k > queries.length) {
                    return -1;
                }
                int left = queries[k - 1][0], right = queries[k - 1][1], val = queries[k - 1][2];

                // Process start and end of range
                if (right >= index) {
                    differenceArray[Math.max(left, index)] += val;
                    differenceArray[right + 1] -= val;
                }
            }
            // Update prefix sum at current index
            sum += differenceArray[index];
        }
        return k;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example Test Case 1:
        int[] nums = {2, 2, 2};
        int[][] queries = { {0, 2, 1}, {0, 2, 1} };
        int result = sol.minZeroArray(nums, queries);
        System.out.println("Minimum number of queries required: " + result);
        
        // Additional Test Case:
        int[] nums2 = {4, 3, 2};
        // This is a demonstration input; adjust queries as needed for a valid scenario.
        int[][] queries2 = { {0, 2, 1}, {0, 1, 1}, {1, 2, 1} };
        int result2 = sol.minZeroArray(nums2, queries2);
        System.out.println("Minimum number of queries required for second test case: " + result2);
    }
}
