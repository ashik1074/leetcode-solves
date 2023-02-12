class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){ //reverse iteration of the array
            if (digits[i]<9){ //if the element of the array is less than 9, just increament and return the array and move to the out of the loop
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0; //if there is a 9 in the array, make it 0 and loop again to check whether there are more 9 or not
            }
        }
        int [] finalArray = new int[digits.length+1];
        finalArray[0] = 1;
        return finalArray;
        
        
        // if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
	// and we again revolve around loop to check for number if less than 9 or not
	// i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
	//      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
	// and will directly return array
        
        // if all number inside array are 9
// i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]
