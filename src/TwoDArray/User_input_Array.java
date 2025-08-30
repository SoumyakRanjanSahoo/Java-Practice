package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class User_input_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row Size:");
        int row=sc.nextInt();
        System.out.println("Enter the Column Size:");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("Enter the Elements:");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();

            }
        }
        for (int [] n:a){
            System.out.print(Arrays.toString(n)+"\n");
        }
    }
}
