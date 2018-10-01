import java.util.Scanner;

import static java.lang.Math.*;

public class Potegowanie {

    //program oblicza ile poteg dwojki jest na drodze do twojej liczby

    public void main(String[] args) {


        int x;
        double suma = 0;
        double potega = 0;
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe calkowita dodatnia");
            x = reader.nextInt();
        } while (x < 0);

        System.out.println("potegi liczby 2, az do twojej liczby to: ");


        while (pow(2, potega) < x) {

            suma = pow(2, potega);
            potega++;
            System.out.println((long) suma);
        }


    }
}