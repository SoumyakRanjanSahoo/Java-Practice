package TwoDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix_Multiplications {
    public static void main(String[] args) {
        int[][] a = {{1,2,1},{3,1,4},{5,7,4}};
        int[][] b = {{1,2,4},{2,5,4},{1,4,8}};
        int [][] c=new int[a.length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for (int k=0;k<a.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for (int[] n:c){
            System.out.println(Arrays.toString(n));
        }
    }
}
