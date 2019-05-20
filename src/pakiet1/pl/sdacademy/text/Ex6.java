package pakiet1.pl.sdacademy.text;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abcd"));
    }
    static boolean isPalindrome(String text) {
        boolean isPalindrome = true;
        for (int i = 0; i <text.length()/2 ; i++) {
            if(!(text.charAt(i) == text.charAt(text.length()-1-i))){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
