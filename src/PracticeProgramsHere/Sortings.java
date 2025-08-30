package PracticeProgramsHere;

import java.util.Arrays;

public class Sortings {
    public static void main(String[] args) {
        int []a ={2,34,6,9,1,0,4,6};
        sort(a);
        System.out.println(Arrays.toString(a));

    }


    //BubbleSort
//    public static void sort(int[]a){
//        for(int i=0;i<a.length-1;i++){
//
//            for(int j=0;j<a.length-1-i;j++){
//                if(a[j]>a[j+1]){
//                    int temp=a[j];
//                    a[j]=a[j+1];
//                    a[j+1]=temp;
//                }
//            }
//        }
//    }


    public static void sort(int[]a){
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[smallest]){
                   smallest=j;
                }

            }
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;

        }

    }
}
