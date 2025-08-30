package RamanaSirQuestions.Arrays;

public class _43CountCharcterInAword {
    public static void main(String[] args) {
        String s="java is easy";
        String[]str=s.split(" ");
        for (String word:str){
            System.out.println(word+"="+word.length());
        }
    }
}
