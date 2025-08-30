public class test {
    public static void main(String[] args) {
      int n=5;

      for(int i=1;i<=n;i++){
          int k=1;
          for(int j=n;j>=1;j--){
              if(i==k)
              System.out.printf(String.valueOf(j));
          }
          System.out.println();
      }

    }

}
