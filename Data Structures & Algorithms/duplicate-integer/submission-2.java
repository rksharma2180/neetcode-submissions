class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums !=null){
            java.util.Arrays.sort(nums);
            for (int n = nums.length; n > 1; n--) {
                if (nums[n-1] == nums[n-2])
                    return true;
            }
        }
        return false;
    }
}