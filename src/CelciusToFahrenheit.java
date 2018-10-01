import java.util.Scanner;

public class CelciusToFahrenheit {

    public class Main {

        //zadanie 1
        public void main(String[] args) {

            int celc;
            System.out.println("Hello World!");
            Scanner reader = new Scanner(System.in);
            System.out.println("Podaj temperature w Celcjuaszach: ");
            celc = reader.nextInt();
            reader.close();
            double fahr = 1.8 * celc + 32;
            System.out.println("Twoja temperatura w Fahrenheitach wynosi");
            System.out.println(fahr);
        }

    }
}