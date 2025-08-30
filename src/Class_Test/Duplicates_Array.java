package Class_Test;

public class Duplicates_Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,1,2,6,7,8};
        System.out.println(Duplicate(array));
    }

    private static String Duplicate(int[] array) {
        String res = "";
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) continue;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = max;
                    res += array[i]+"\n";
                }
            }
        }
        return res;
    }
}
//2,4,1,5,2,8,9,2,1,1 check this output in chatgpt....
