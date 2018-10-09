import java.util.Scanner;

public class CFTablicaWspolnychDzielnikow {

    //Tablica wspólnych dzielników dla podanej liczby

    public void main(String[] args) {

        int n;
        boolean errorCheck = (true);
        Scanner reader = new Scanner(System.in);

        //pobieranie danych
        do {
            if (!errorCheck) {
                System.out.println("\nDej wiekszą liczbę ziąąą");
            }
            System.out.println("Podaj liczbę (>0): ");
            errorCheck = (false);
            n = reader.nextInt();
        } while (n < 1);

        //tworzenie tablicy

        boolean[][] tablica = new boolean[n][n];

        System.out.println();
        System.out.print("  ");
        for (int i = 1; i <= n; i++) {
            if (i > 9) {
                System.out.print(" " + i);
            } else
                System.out.print("  " + i);
        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            if (i + 1 > 9) {
                System.out.print((i + 1));
            } else {
                System.out.print((i + 1) + " ");
            }

            //tworzenie tabelki
            for (int j = 0; j < n; j++) {

                for (int x = 2; x <= n; x++) {
                    if ((j + 1) % x == 0) {
                        if ((i + 1) % x == 0) {
                            tablica[i][j] = true;
                            break;
                        }
                    }
                }
                if (tablica[i][j] == true) {
                    System.out.print("  .");
                } else {
                    System.out.print("  +");
                    tablica[i][j] = false;
                }
            }
            System.out.println();
        }
    }
}
