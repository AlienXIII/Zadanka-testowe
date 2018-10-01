
import java.util.Scanner;

public class DzielnikiLiczby {

    //Program wypisujący dzielniki danej liczby.

    public  void main(String[] args) {

        int x;
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        x = reader.nextInt();
        System.out.print(x + " - Dzielniki to: ");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
