package Class_Test;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
       int[]a={2,9,6,8};
       int n=10;
       for (int i=1;i<=n;i++){
           boolean found=false;
           for (int num:a){
               if (num==i){
                   found=true;
                   break;
               }
           }
           if (!found) System.out.println(i+" ");
       }
    }
}
//public class MissingNumber {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5, 6};  // missing 3
//        int n = arr.length + 1;        // total numbers should be 6
//
//        // expected sum of 1..n
//        int expectedSum = n * (n + 1) / 2;
//
//        // actual sum
//        int actualSum = 0;
//        for (int num : arr) {
//            actualSum += num;
//        }
//
//        int missing = expectedSum - actualSum;
//        System.out.println("Missing number is: " + missing);
//    }
//}
