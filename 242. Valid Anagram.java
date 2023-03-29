






//This is also a solution which gives correct result but time limit exceeded


// import java.util.Arrays;

// public class solution2 {
//     public static void main (String[]args){
//         String s = "rat";
//         char [] c = s.toCharArray();
//         String t = "car";
//         char [] c1 = t.toCharArray();
//         int p=0;
//         char temp;
//         while (p<c.length){
//             int q=p+1;
//             while (q<c.length){
//                 if (c[p]>c[q]){
//                     temp = c[p];
//                     c[p] = c[q];
//                     c[q] = temp;
//                 }
//                 q++;
//             }
//             p++;
//         }
//         int i=0;
//         while (i<c1.length){
//             int j=i+1;
//             while (j<c1.length){
//                 if (c1[i]>c1[j]){
//                     temp = c1[i];
//                     c1[i] = c1[j];
//                     c1[j] = temp;
//                 }
//                 j++;
//             }
//             i++;
//         }

//         boolean retval = Arrays.equals(c, c1);
//         boolean retval2 = Arrays.equals(c, c1);
// //        for (int k=0;k<c.length;k++){
// //            System.out.print(c[k]+" ");
// //        }
// //        System.out.println();
// //
// //        for (int k=0;k<c1.length;k++){
// //            System.out.print(c1[k]+" ");
// //        }


//     }
// }
