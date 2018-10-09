import java.util.Arrays;
import java.util.Random;


public class CAPodstawaTablic {

    //tablica z losowymi liczbami i wyswietlanie roznych jej detali

    public  void main(String[] args) {

        //tworzenie tablicy z losowymi liczbami

        Random rand = new Random();
        double suma = 0;
        int[] tablica = new int[10];

        for (int i = 0; i < 10; i++) {

            int n = rand.nextInt(21) - 10;

            tablica[i] = n;
            suma += tablica[i];

        }

        //obliczenia

        double srednia = suma / 10;
        int dlugosc = tablica.length;
        int max = tablica[0];
        int min = tablica[0];
        int mniejsze = 0;
        int wieksze = 0;

        for (int i = 0; i < dlugosc; i++) {

            if (tablica[i] > max)
                max = tablica[i];
            if (tablica[i] < min)
                min = tablica[i];
        }
        for (int i = 0; i < 10; i++) {
            if (tablica[i] > srednia) wieksze++;
            if (tablica[i] < srednia) mniejsze++;
        }

        //wyswietlanie

        System.out.println("Wylosowane liczby: " + Arrays.toString(tablica));
        System.out.println("Srednia: " + srednia);
        System.out.println("Min: " + min + " ,max: " + max);
        System.out.println("Mnniejszych od śr.: " + mniejsze);
        System.out.println("Wiekszych od śr.: " + wieksze);
        System.out.println("Liczby w odwrotnej kolejnosci");
        for (int i = 9; i > 0; i--) {
            System.out.print(tablica[i] + " ");
        }

    }
}