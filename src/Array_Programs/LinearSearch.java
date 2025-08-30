package Array_Programs;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a ={5,2,3,7,88,9,1};
        System.out.println(find(a,5));
    }
    public  static int find(int[] a, int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                return i;


        }
        return -1;
    }
}
