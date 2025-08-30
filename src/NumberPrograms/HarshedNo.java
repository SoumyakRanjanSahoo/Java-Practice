package NumberPrograms;

public class HarshedNo {
    public static void main(String[] args) {
        int n=23;
        if (isHarshed(n,0,n)) System.out.println("Harshed");
        else System.out.println("no");

    }
    public static boolean isHarshed(int n,int sum,int original){
        if (n==0)
            return (original%sum==0);
        sum+=n%10;
        return isHarshed(n/=10,sum,original);
    }
}
