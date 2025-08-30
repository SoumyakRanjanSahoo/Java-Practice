package PracticeProgramsHere;

public class spral_matrix {
    public static void main(String[] args) {

        int n=5;
        int k=1;
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i%2==1){
                                    if (j==1 || j==n)
                                    System.out.print(2+" ");
                                    else
                                        System.out.print(k+" ");
                                }

            }
            System.out.println();
        }
    }
}
