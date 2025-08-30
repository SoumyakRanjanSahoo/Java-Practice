package NumberPrograms;

public class PerfectNo {
    public static void main(String[] args) {
        
       range(1,100);
    }
    public static int perfect(int n,int sum,int index){
        if (index==n) return sum;
        if(n%index==0) sum+=index;
        return perfect(n,sum,index+1);
    }


    //perfect number in a range............

     public static void range(int a ,int b){
        if (a>b)return ;
        if (perfect(a,0,1)==a) System.out.println(a);
        range(a+1,b);
     }

}

