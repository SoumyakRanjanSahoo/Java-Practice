package Array_Programs;

public class Even_Elements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for(int n:a){
            if(n%2==0)
                System.out.println(n);
        }

    }
}