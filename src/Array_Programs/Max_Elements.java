package Array_Programs;

public class Max_Elements {
    public static void main(String[] args) {
        int[] a={1,3,4,6,9,2};
        int max=0;
        for(int n:a){
            if(n>max)
                max=n;
        }
        System.out.println(max);
    }
}
