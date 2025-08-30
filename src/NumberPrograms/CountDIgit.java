package NumberPrograms;

public class CountDIgit {
    public static void main(String[] args) {
        int num=122;
        System.out.println(count(num,0));
    }
    public static int count(int n,int count){
        if (n==0)return count;
        int d=n%10;
        count++;
        return count(n/=10,count);
    }
}
