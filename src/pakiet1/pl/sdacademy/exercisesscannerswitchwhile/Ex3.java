package pakiet1.pl.sdacademy.exercisesscannerswitchwhile;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        switch (figure) {
            case "kwadrat":
                System.out.println("Wybrałeś kwadrat");
                int a = sc.nextInt();
                System.out.println("Pole to: " + squareField(a));
                System.out.println("Obwód to " + squareCircuit(a));
                break;
            case "prostokąt":
                System.out.println("Wybrałeś prostokąt");
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();
                System.out.println("Pole to: " + rectangleField(r1, r2));
                System.out.println("Obwód to " + rectangleCircuit(r1,r2));
                break;
            case "koło":
                System.out.println("Wybrałeś koło");
                int r = sc.nextInt();
                System.out.println("Pole to: " + circlesField(r));
                System.out.println("Obwód to " + circleCircuit(r));
                break;
            case "trójkąt":
                System.out.println("Wybrałeś trójkąt");
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                System.out.println("Pole to: " + tranglesField(t1, t2));
                System.out.println("Obwód to " + traingleCircuit(t1, t2));
                break;
            default:
                System.out.println("Coś poszło nie tak");
        }

    }

    static double squareField(int a) {
        return a * a;
    }

    static double squareCircuit(int a) {
        return 4 * a;
    }

    static double rectangleField(int a, int b) {
        return a * b;
    }

    static double rectangleCircuit(int a, int b) {
        return 2 * (a + b);
    }

    static double circlesField(int r) {
        return r * r * Math.PI;
    }

    static double circleCircuit(int r) {
        return 2 * Math.PI * r;
    }
    static double tranglesField(int a, int h) {
        return (a * h) / 2;
    }

    static double traingleCircuit(int a, int h) {
        return a + h + Math.sqrt(a * a + h * h);
    }
}
