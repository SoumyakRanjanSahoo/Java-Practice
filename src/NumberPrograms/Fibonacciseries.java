package NumberPrograms;

public class Fibonacciseries {

    public static void main(String[] args) {
        System.out.println("0 1 ");
        fibo(0,1,10);
    }
    public static void fibo(int a,int b ,int limit){
        int c=a+b;
        if (c>limit)return ;
        System.out.println(c+" ");
        fibo(b,c,limit);
    }
}
