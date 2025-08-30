package Array_Programs;

public class BinarySearchRecurssion {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10,12};
        System.out.println(search(a,12,0,a.length));
    }
    public static int search(int[]a,int key,int st,int end){
        if(st>end)
            return -1;
        int mid=(st+end)/2;
        if(key==a[mid])
            return mid;
        else if (key<a[mid]) {
            return search(a,key,st,mid-1);

        }
        return search(a,key,mid+1,end);
    }
}
