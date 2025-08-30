package Class_Test;

public class Remove_Duplicates {
    public static void main(String[] args) {
        String s = "jaavva";
        System.out.println(RemoveDup(s));
    }

    public static String RemoveDup(String s) {
        char[] ch = s.toCharArray();
        String res = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000') continue;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    ch[j] = '\u0000';
                }
            }
            res += ch[i];
        }
        return res;
    }
}
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class FindDuplicates {
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(4);
//        list.add(1);
//
//        HashSet<Integer> seen = new HashSet<>();
//        HashSet<Integer> duplicates = new HashSet<>();
//
//        for (Integer num : list) {
//            if (!seen.add(num)) { // add() returns false if element already exists
//                duplicates.add(num);
//            }
//        }
//
//        System.out.println("Duplicate elements: " + duplicates);
//    }
//}
