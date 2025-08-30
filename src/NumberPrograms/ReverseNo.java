package NumberPrograms;

public class ReverseNo {
    public static void main(String[] args) {
        int n=871;
        System.out.println(reverse(n,0));
    }
    public static  int reverse(int n,int res){
        if (n==0)return res;
        int digit=n%10;
        res=res*10+digit;
        return reverse(n/=10,res);
    }
}
