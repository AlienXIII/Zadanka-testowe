import java.util.Scanner;
import java.util.Random;

public class OdgadnijLiczbe {

    //Zgaduj zgadula jaka wymyslilem liczbe

    public void main(String[] args) {

        int szukana, x;

        Random rand = new Random();
        szukana = rand.nextInt(100) + 1;  //100 is the maximum and the 1 is our minimum

        Scanner reader = new Scanner(System.in);
        System.out.println("Zgadnij liczbe od jeden do sto: ");

        do {
            x = reader.nextInt();

            if (x > szukana) {
                System.out.println("Za duzo! Podaj mniejsza");
            }
            if (x < szukana) {
                System.out.println("Za malo! Podaj wieksza liczbe");
            }

        } while (x != szukana);

        System.out.println("CONGLATURATION!\nSzukana liczba to " + szukana);


    }
}