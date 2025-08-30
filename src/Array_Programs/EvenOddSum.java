package Array_Programs;

public class EvenOddSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int OddSum=0;
        int EvenSum=0;
        for(int n:a){

            if(n%2==0){
                EvenSum+=n;
            }
            else
                OddSum+=n;

        }
        System.out.println(EvenSum);
        System.out.println(OddSum);

    }
}
