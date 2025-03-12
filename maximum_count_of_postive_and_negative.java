import java.lang.*;
class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int l = nums.length;
        for(int i=0; i<l; i++){
            if(nums[i] > 0){
                pos++;
            }else if(nums[i] < 0){
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}
