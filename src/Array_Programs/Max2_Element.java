package Array_Programs;

public class Max2_Element {
    public static void main(String[] args) {
        int[] a={8,3,4,9,2,1};
        int max_1=0;
        int max_2=0;
       for(int i=0;i<a.length;i++){
           if(a[i]>max_1){
               max_2=max_1;
               max_1=a[i];
           } else if (a[i]>max_2 && a[i]!=max_1) {
               max_2=a[i];
           }
       }
        System.out.println(max_2);
    }
}
