import java.util.Scanner;

public class LiczbyWCiagu {

    //podajesz ile chcesz liczb, a program sprawdza je na koncu
    //zero konczy program

    public void main(String[] args) {

        int x = 666;
        int y = 0;
        int suma = 0;
        int iloscLiczb = 0;
        int najwieksza = 0;
        int najmniejsza = 0;
        int srednia = 0;

        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Podaj liczbe, nie krepuj sie: ");
            x = reader.nextInt();
            if (x != 0) {
                iloscLiczb++;
                suma += x;
                if (x > y && x > najwieksza) {
                    najwieksza = x;
                }
                if (najmniejsza == 0 || (x < y && x < najmniejsza)) {
                    najmniejsza = x;
                }
                y = x;
                srednia = suma / iloscLiczb;
            }
        } while (x != 0);

        if (suma != 0) {
            System.out.println("min: " + najmniejsza);
            System.out.println("Max: " + najwieksza);
            System.out.println("Suma: " + suma);
            System.out.println("średnia: " + srednia);
        } else {
            System.out.println("nie podales zadnych liczb! Na czym ja mam pracowac?");
        }
    }
}