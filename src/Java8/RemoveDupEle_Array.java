package Java8;

import java.util.Arrays;

public class RemoveDupEle_Array {
    public static void main(String[] args) {
        int[]a={1,2,3,1,2,3};
        int[]b= Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(b));
    }
}
