import java.util.Scanner;

public class SilniaIFibonacci {

    //silnia i ciag fibbonaciego

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe, nie krepuj sie: ");
        int x = reader.nextInt();
        long wynik = 1;
        long fibbo = 0;

        for (long i = 1; i <= x; i++) {
            wynik *= i;

        }
        System.out.println("Silnia twojej liczby to: \n" + wynik);
        System.out.println("(Jesli widzisz tu zero to znaczy, ze przegiałeś z liczbą");
        System.out.println("Ciąg Fibonacciego twojej liczby to: ");

        for (int i = 1; i <= x; i++)
            System.out.println(i + ": " + fibonacci(i));

    }

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
