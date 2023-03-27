class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null){  //only if string is empty
            return -1;
        }
        int sum = 0;
        for (char c : columnTitle.toUpperCase().toCharArray()){ //convert the string into Char Array
            sum*=26; //since we have 26 Alphabets, the base will be 26 and will increase every time we shift to the right side of char array
            sum+=c-'A'+1; //value of c - value of 'A'(65)+1; 
        }
        return sum;
    }
}
