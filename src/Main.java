import java.util.Arrays;
import java.util.Random;

public class Main {

    //opis programu

    public static void main(String[] args) {

        Random rand = new Random();

        int[][] tablica = new int[5][5];

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rand.nextInt(11) - 5;
            }
        }

            //wyswietlanie

        for(int i=0;i<tablica.length; i++)
        {
            for(int j=0; j<tablica[i].length; j++)
            {
                System.out.print(tablica[i][j] + " ");

            }
            System.out.print("\n");
        }







    }
}
