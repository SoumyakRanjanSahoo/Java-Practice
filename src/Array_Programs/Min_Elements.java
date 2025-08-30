package Array_Programs;

public class Min_Elements {
    public static void main(String[] args) {
        int[] a={5,3,2,7,8,1};
        int min=a[0];
        for(int n:a){
            if(n<min)
                min=n;
        }
        System.out.println(min);
    }
}
