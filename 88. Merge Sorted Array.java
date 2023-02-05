class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=m, j=0;i<(m+n);i++,j++){ //just start putting nums2 elements from mth position to (m+n)th position 
                nums1[i] = nums2[j];
        }
        Arrays.sort(nums1); //sort the whole nums1 array
    }
}
