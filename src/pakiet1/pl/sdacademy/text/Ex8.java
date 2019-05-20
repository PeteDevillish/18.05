package pakiet1.pl.sdacademy.text;

//8. Sprawdź dla wybranego tekstu, dla której litery będziemy mieli najdłuższy ciąg wystąpień tylko tej litery.
// Przykładowo: aabbbccbb - dla tego tekstu będzie to b, które wystąpiło pod rząd 3 razy. Jeśli dla wielu liter mamy najdłuższy ciąg powtórzeń,
// to wynikiem będzie litera tworząca pierwszy z tych ciągów.
public class Ex8 {
    public static void main(String[] args) {
        System.out.println(thelongestCiag("aaabbbbbbbhhhhhdb dnkdkdk"));
    }

    static char thelongestCiag(String text) {
        int counter = 1;
        int localCounter = 0;
        char result = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                localCounter++;
            } else {
                if (localCounter>counter){
                    result = text.charAt(i-1);
                    counter = localCounter;
                }
                localCounter = 0;
            }
        }
        return result;
    }
}
