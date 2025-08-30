package RamanaSirQuestions.Arrays;

public class _7FindIndexValue {
    public static void main(String[] args) {
        String s="ash123";
        char key='s';
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==key){
                System.out.println(i);
                break;
            }
        }

    }
}
