class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        //System.out.println(s.length());
        s = s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<=j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
