package Array_Programs;

import java.util.Arrays;

public class Shift_0_toRight {

    public static void main(String[] args) {
        int [] a={3,0,1,2,0,5,0};
        int [] b=new int[a.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
