package pakiet1.pl.sdacademy.method;

public class Method {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        printWithPrefix("Mariusz, ", "czy to Ty?");
    }

    static int add (int a, int b){
        return a + b;
    }
    static void printWithPrefix (String prefix, String text){
        System.out.println(prefix + " " + text);
    }
}
