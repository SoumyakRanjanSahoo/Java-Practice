package TwoDArray;

public class Minimum_Element {
    public static void main(String[] args) {
        int[][]a={{7,10,20},{70,80,1},{40,50,12}};
        int min=a[0][0];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]<min)
                    min=a[i][j];
            }
        }
        System.out.println(min);
    }
}
