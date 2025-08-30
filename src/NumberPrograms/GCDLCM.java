package NumberPrograms;

public class GCDLCM {
    public static void main(String[] args) {
        int a=36;
        int b=60;
        int gcd=gcd(a,b);
        int lcm=lcm(a,b,gcd);
        System.out.println("gcd"+gcd);
        System.out.println("lcm"+lcm);
    }
    public static int gcd(int a, int b){
           if (b==0)
               return a;
           return gcd(b,a%b);
    }
    public static int lcm(int a,int b,int gcd){
        return (a*b)/gcd;
    }
}
