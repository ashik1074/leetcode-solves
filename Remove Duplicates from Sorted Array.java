class Solution {
    public int removeDuplicates(int[] nums) {
            int tracker = 1;
                for(int i = 1; i < nums.length; i++) {
                    if (!(nums[i - 1] == nums[i])){
                        nums[tracker] = nums[i];
                        tracker++;
                    }
                }
                return tracker;
    }
}
