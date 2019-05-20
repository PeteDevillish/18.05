package pakiet1.pl.sdacademy.text;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(ex9("aaa", "bcaaad"));
        System.out.println(ex9("abc", "bcd"));
    }

    static boolean ex9(String text1, String text2) {
        boolean isTrue = false;
        int biggerString = Math.max(text1.length(), text2.length());
        int smallerString = Math.max(text1.length(), text2.length());

        for (int i = 0; i < biggerString - smallerString; i++) {
            if (text1.charAt(i) == text2.charAt(i)) {
                boolean localBool = true;
                for (int j = i + 1; j < i + smallerString; j++) {
                    if (text1.charAt(j) != text2.charAt(j)) {
                        localBool = false;
                        break;
                    }
                }
                if (localBool == true){
                    return true;
                }
            }

        }
        return isTrue;
    }
}
