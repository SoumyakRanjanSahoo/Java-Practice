package Strings_Programm;

public class RemoveDupWords {
    public static void main(String[] args) {
        String s = "Bangalore is a Bangalore City";
        System.out.println(removeDup(s));

    }

    public static String removeDup (String s)
    {
            String res = "";
            String[] str = s.split(" ");
            for (int i = 0; i < str.length; i++) {
                if (str[i] == " ")
                continue;
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].equals(str[j])) {
                        str[j] = "";

                    }
                }
                res += str[i];
                res += " ";
            }
            return res.trim();
        }
    }
