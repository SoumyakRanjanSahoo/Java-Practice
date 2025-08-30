package Array_Programs;

public class UniqueElements {
    public static void main(String[] args) {


        int[] a = {1, 3, 4, 3, 1, 5,3, 6};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j])
                    count++;
            }
            if (count == 1)
                System.out.println(a[i]);
        }

    }
}