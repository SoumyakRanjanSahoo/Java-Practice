package RamanaSirQuestions.Arrays;

public class _37RemoveDupWords {
    public static void main(String[] args) {
        String s="happy happy birthday";
        String res="";
        String[]str=s.split(" ");
        for (int i=0;i< str.length;i++){
            if (str[i].equals(""))continue;
            res+=str[i]+" ";
            for (int j=i+1;j< str.length;j++){
                if (str[i].equals(str[j])){
                    str[j]="";
                }
            }

        }
        System.out.println(res.trim());
    }
}
