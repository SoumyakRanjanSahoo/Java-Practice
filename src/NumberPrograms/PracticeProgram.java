package NumberPrograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
//
        System.out.println("-------------------------");

        //Factorial
//        int fact=1;
//        for(int i=n;i>=1;i--){
//            fact=fact*i;
//        }
//
//        System.out.println(fact);


        //Harshed Number
//           int n1=n;
//           int sum=0;
//           while (n!=0){
//               int temp=n%10;
//               sum+=temp;
//               n/=10;
//           }
//           if(n1%sum==0)
//               System.out.println("Harshed No");
//           else
//               System.out.println("Not A Harshed No");

          //Reverse Number

//        int n1=n;
//        int rev=0;
//        while(n!=0){
//            int temp=n%10;
//            rev=rev*10+temp;
//            n/=10;
//        }
//        System.out.println(rev);

        //Pallindrome Number
//
//        int n1=n;
//        int rev=0;
//        while(n!=0){
//            int temp=n%10;
//            rev=rev*10+temp;
//            n/=10;
//        }
//
//        if(rev==n1){
//            System.out.println("Pallindrome");
//        }
//        else{
//            System.out.println("Not a Pallindrome");
//        }

         //Fibonacci Series

//        int  a =0;
//        int b =1;
//       int c=0;
//
//        for(int i=1;i<=n;i++){
//
//            System.out.println(a);
//
//           c=a+b;
//            a=b;
//            b=c;
//
//        }


        //Count digits
//        int count=0;
//        while(n!=0){
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
//


        //Perfect Number
//int n1=n;
//int sum=0;
//for(int i=1;i<n;i++){
//    if(n%i==0)
//        sum+=i;
//}
//if(n1==sum){
//            System.out.println("perfect");
//        }
//else{
//    System.out.println("not a Perfect");
//}
//

  //Addition of all Perfect Numbers in a range


//int addperfect=0;
//for(int i=start;i<=end;i++) {
//    int num = i;
//    int sum = 0;
//    for (int j=1;j<=num/2;j++){
//        if(num%j==0){
//            sum+=j;
//        }
//
//     if(sum==num)
//        {
//            addperfect+=num;
//        }
//
//    }
//
//}
//        System.out.println(addperfect);
//
//

            //all pallindrome numbers in a range
//
//    String  count="";
//        for(int j=start;j<=end;j++){
//            int num=j;
//            int temp=j;
//            int rev=0;
//            while (num!=0){
//                int rem=num%10;
//                rev=rev*10+rem;
//                num/=10;
//            }
//            if(temp==rev){
////                count=count+temp+" ";
//                System.out.println(temp);
//            }
//
//        }
////        System.out.println(count);
////
//
//int power= sc.nextInt();
//int sum=1;
//for(int i=1;i<=power;i++){
//     sum*=n;
//}
//
//        System.out.println(sum);
//
//

int backup=n;
int count=0;
while(n!=0){
    count++;
    n/=10;
}
  System.out.println(count);
n=backup;
int sum=0;
while (n!=0){
    int d=n%10;
    int prod=1;

    for(int i=1;i<=count;i++){
        prod*=d;

    }
    sum+=prod;
    n/=10;
}

if(backup==sum){
    System.out.println("Armstrong");
}
else{
    System.out.println("Not");
}



















    }
}
