package pakiet1.pl.sdacademy.text;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(howManyOfA("aaabbhsa"));
    }

    static int howManyOfA(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a')
                result++;
        }
        return result;
    }
}
