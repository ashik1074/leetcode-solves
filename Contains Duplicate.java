class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i:nums){
          //"set.add(i)"adds the specified element e to this set if this set contains no element e2 such that (e==null ? e2==null : e.equals(e2)). 
          //If this set already contains the element, the call leaves the set unchanged and returns false.
            if (!set.add(i)){   
                return true;
            }
        }
        return false;
    }
}
