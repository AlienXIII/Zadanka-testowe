import java.util.Scanner;

import static java.lang.System.exit;


public class Calculator {

    public void main(String[] args) {

        int input;
        int x = 0;
        int y = 0;

        System.out.println("SIEMA!" + "\n" + "Jestem zajebistym kalkulatorem");
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Aby dodac liczby wcisnij 1");
            System.out.println("Aby odjac liczby wcisnij 2");
            System.out.println("Aby pomnozyc liczby wcisnij 3");
            System.out.println("Aby podzielic liczby wcisnij 4");
            System.out.println("Aby zakonczyc program nacisnij 5");

            System.out.println("Podaj pierwsza liczbe :");
            x = reader.nextInt();

            System.out.println("Podaj druga liczbe :");
            y = reader.nextInt();

            System.out.println("A teraz co chcesz z tym zrobic?");

            input = reader.nextInt();

            switch (input) {
                case 1:
                    System.out.println(add(x, y));
                    break;
                case 2:
                    System.out.println(sub(x, y));
                    break;
                case 3:
                    System.out.println(mult(x, y));
                    break;
                case 4:
                    if (y != 0) {
                        System.out.println(div(x, y));
                        break;
                    } else {
                        System.out.println("Pamietaj cholero nie dziel przez zero!");
                        break;
                    }
                case 5:
                    System:
                    exit(0);
                default:
                    System.out.println("Co ty odpierdalasz? Pokazalem ci co masz nacisnac!");
            }
        }
        while (input != 5);
    }


    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }
}
