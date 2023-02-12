class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){ //reverse iteration of the array
            if (digits[i]<9){ //if the element of the array is less than 9, just increament and return the array and move to the out of the loop
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int [] finalArray = new int[digits.length+1];
        finalArray[0] = 1;
        return finalArray;
