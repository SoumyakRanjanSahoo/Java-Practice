package Array_Programs;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10,12};
        System.out.println(search(a,12));
    }
    public static int search(int[]a,int key){
        int st=0;
        int end=a.length-1;
        while (st<=end){
            int mid=a[(st+end)/2];
            if(key==mid)
                return mid;

            else if (st<mid) {
                end=mid-1;
            }
            else if (end>mid) {
                st=mid+1;
            }

        }
        return -1;
    }
}