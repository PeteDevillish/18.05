package pakiet1.pl.sdacademy.text;

public class Text {
    public static void main(String[] args) {
        String text = "abcdef";
        int length = text.length();
        System.out.println("Długość tekstu: " + length);
        System.out.println("Długość tekstu: " + text.length());

        char c = 'a';
        System.out.println("Wartość przypisana zmiennej c: " + c);
        c = 97;
        System.out.println("Wartość przypisana zmiennej c: " + c);
        c = text.charAt(3);
        System.out.println("Wartość przypisana zmiennej c: " + c);
        System.out.println("Drugi znak tekstu: " + text.charAt(1));
        System.out.println("abcde".charAt(3));

    }
}
