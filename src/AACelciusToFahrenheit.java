import java.util.Scanner;

public class AACelciusToFahrenheit {

    public class Main {

        //zadanie 1
        public void main(String[] args) {

            int celc;

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