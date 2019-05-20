package pakiet1.pl.sdacademy.method;

public class Exercises {
    public static void main(String[] args) {

        System.out.println(contains("aa", "b"));
        System.out.println(contains("aa", "b"));
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static String concantenate(String a, String b) {
        return a + b;
    }

    static int multiply2(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= b;
        }
        return result;
    }

    static int howManyCharactersInString(String a, char b) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b == a.charAt(i)) counter++;

        }
        return counter;
    }

    static boolean contains(String a, String b) {
        boolean isTrue = false;
        for (int i = 0; i < a.length() - b.length(); i++) {
//            if (a.charAt(i) == b.charAt(i)) {
                isTrue = true;
                for (int j = i ; j < i + b.length(); j++) {
                    if (!(a.charAt(j) == b.charAt(j))) isTrue = false;
                    break;
                }
                if (isTrue == true) return isTrue;
//            }
        }
        return isTrue;
    }

}
