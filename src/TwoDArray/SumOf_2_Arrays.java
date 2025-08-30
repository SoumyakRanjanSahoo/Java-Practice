package TwoDArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOf_2_Arrays {
    public static void main(String[] args) {
        int[][] a = { {1,2,3},{1,4,5},{6,5,4}};
        int[][] b = {{1,0,7},{2,5,9},{1,9,3}};

        int[][]c=new int[a.length][a.length];
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
            for (int[]n:c){
                System.out.print(Arrays.toString(n)+"\n");
            }
        }
    }
