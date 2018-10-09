import java.util.Random;

public class CCTablicaDwuwymiarowa {

    //Tablica dwuwymiarowa z losowymi liczbami

    public void main(String[] args) {

        Random rand = new Random();

        int[][] tablica = new int[5][5];

        //wypelnianie tablicy losowymi liczbami

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rand.nextInt(11) - 5;
            }
        }

        //wyswietlanie

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if (tablica[i][j] >= 0) System.out.print(" ");
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMinimalne wartosci w kolumnach: ");

        for (int j = 0; j < tablica.length; j++) {
            int mniejsze = tablica[0][j];
            for (int i = 0; i < tablica[j].length; i++) {
                if (tablica[i][j] < mniejsze) {
                    mniejsze = tablica[i][j];
                }
            }
            System.out.println(j + ": " + mniejsze);
        }
        System.out.println("Maksymalna wartosci w wierszach: ");

        for (int j = 0; j < tablica.length; j++) {
            int wieksza = tablica[j][0];
            for (int i = 0; i < tablica[j].length; i++) {
                if (tablica[j][i] > wieksza) {
                    wieksza = tablica[j][i];
                }
            }
            System.out.println(j + ": " + wieksza);
        }
        System.out.println();
        System.out.print("Maksimum na 1. przekątnej: ");
        int wieksza = tablica[0][0];
        for (int i = 0; i < tablica.length; i++) {

            if (tablica[i][i] > wieksza){
                wieksza = tablica[i][i];
            }
        }
        System.out.print(wieksza);
        System.out.println();
        System.out.print("Minimum na 2. przekątnej: ");
        int j=(tablica[0].length)-1;
        int mniejsza = tablica[0][j];
        for (int i=0;i < tablica.length;i++)
        {
            if (tablica[i][j] < mniejsza){
                mniejsza = tablica[i][j];
            }
            j--;
        }
        System.out.print(mniejsza);

    }
}
