package NumberPrograms;

public class PallindromeNo {
    public static void main(String[] args) {
        range(100, 200);
    }
    public static  boolean pallindrome(int n,int rev,int original){
        if (n==0)return (rev==original);
        int digit=n%10;
        rev=rev*10+digit;
        return pallindrome(n/=10,rev,original);
    }

    // pallindrome  number in a range

    public static void range(int a ,int b){
        if (a>b)return;
        if(pallindrome(a,0,a)) System.out.println(a);
        range(a+1,b);
    }
}
