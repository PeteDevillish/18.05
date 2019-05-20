package pakiet1.pl.sdacademy.text;

public class Ex5 {
    public static void main(String[] args) {
        String a = "alfabet";
        char result = a.charAt(0);
        for (int i = 0; i < a.length()-1; i++) {
            if(a.charAt(i)>result)
            result = a.charAt(i);
        }
        System.out.println(result);
    }
}
