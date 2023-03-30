/*Biginteger class in java is used for mathematical operations 
that require integer values "larger than what primitive data types"(for example: int) can store.*/

import java.math.BigInteger; //You must import the library for the BigInteger first

class Solution {
    public String addBinary(String a, String b) {
        BigInteger bigInteger1 = new BigInteger(a,2); //string a to BigInteger conversion
        BigInteger bigInteger2 = new BigInteger(b,2);//string a to BigInteger conversion
        BigInteger sum = bigInteger1.add(bigInteger2);
        return sum.toString(2); //convert the result into string with toString() method and keep the base 2.
    }
    
}
