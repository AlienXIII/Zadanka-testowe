import java.util.Scanner;

public class ZczytywanieLiczb {

    //podajesz liczby, a program liczy ich sume

    public void main(String[] args) {

        int x = 0;
        int suma = 0;

        do {

            x = 0;
            Scanner reader = new Scanner(System.in);
            System.out.println("Podaj liczbe. nie krepuj sie: ");
            x = reader.nextInt();
            suma += x;

        } while (x != 0);

        System.out.println("Suma wszystkich podanych liczb to: ");
        System.out.println(suma);

    }
}