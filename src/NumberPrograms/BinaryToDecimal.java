package NumberPrograms;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary=1001;
        System.out.println(decimal(binary,0));
    }
    public static int decimal(int binary,int power){
      if(binary==0)
          return 0;
      int digit=binary%10;
      return digit*(int)Math.pow(2,power)+decimal(binary/10,power+1);
    }
}
