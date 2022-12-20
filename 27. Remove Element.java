class Solution {
    public int removeElement(int[] nums, int val) {
        //keeps count of the length of total elements that will remain after deletion
        int counter=0; 
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[counter]=nums[i];
                counter++;
            }
        }
        return counter;
    }
}
