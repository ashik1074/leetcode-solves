class Solution {
    public boolean isPalindrome(int x) {
        String sx = Integer.toString(x);
        String rev = "";
        boolean ans = false;
        for(int i=sx.length()-1;i>=0;i--){
            rev = rev+sx.charAt(i);
        }
        if(sx.equals(rev)){
            return true;
        }
        else{
            return false;
        }
        //return ans;
    }
}
