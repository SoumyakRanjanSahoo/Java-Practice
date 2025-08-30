package NumberPrograms;

public class PrimeNo {
    public static void main(String[] args) {
        int n=7;
        System.out.println(Prime(n,2));

    }
    public static boolean Prime(int n ,int index){
        if (n<2) return false;
        if (index * index > n) return true;
        if (n%index==0) return false;
        return Prime(n,index+1);
    }
}
