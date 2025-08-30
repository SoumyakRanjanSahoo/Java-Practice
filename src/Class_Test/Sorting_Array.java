package Class_Test;

import java.util.Arrays;

public class Sorting_Array {
    public static void main(String[] args) {
        int[]a={5,2,9,1,8,0,1,5};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public  static void sort(int[]a){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                    if (a[j]>a[j+1]){
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
            }
        }
    }
}
