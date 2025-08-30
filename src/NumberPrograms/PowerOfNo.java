package NumberPrograms;

public class PowerOfNo {
    public static void main(String[] args) {
        int n=2;
        int power=3;
        System.out.println(pow(n,power));

    }
    public static int  pow(int n,int power){
        if (power==0)return 1;

        return n*pow(n,power-1);
    }
}
