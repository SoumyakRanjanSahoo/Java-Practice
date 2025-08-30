package Array_Programs;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[]a={1,2,4,6,7,8,1,7,8,4};
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]==max)
                continue;
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=max;
                }
            }
            System.out.print(a[i]+" ");
        }
    }
}
