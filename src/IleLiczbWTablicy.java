import java.util.Arrays;
import java.util.Random;

public class IleLiczbWTablicy {

    //program generuje 20 liczb z zakresu 1-10 a potem sprawdza ile razy jaka sie pojawila

    public void main(String[] args) {

        Random rand = new Random();

        int[] tablica = new int[20];

        for (int i = 0; i < 20; i++) {

            int n = rand.nextInt(10) + 1;

            tablica[i] = n;
        }

        System.out.println("Zawartość: " + Arrays.toString(tablica));
        System.out.println("Wystapienia: ");
        int x = 0;

        for (int i = 1; i < 11; i++) {

            x = 0;
            for (int q = 0; q < 20; q++) {

                if (tablica[q] == i) x++;
            }

            System.out.println(i + " - " + x);
        }

    }
}
