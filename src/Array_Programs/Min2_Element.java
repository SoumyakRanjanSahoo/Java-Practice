package Array_Programs;

public class Min2_Element {
    public static void main(String[] args) {
        int[] a={6,2,8,9,0,3,5,1,9};
        int min_1=Integer.MAX_VALUE;
        int min_2=Integer.MAX_VALUE;
       for(int n:a){
           if(n<min_1){
               min_2=min_1;
               min_1=n;
           } else if (n<min_2 && n!=min_1) {
               min_2=n;
           }
       }
        System.out.println(min_2);
    }
}
