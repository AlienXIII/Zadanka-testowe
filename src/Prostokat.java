import java.util.Scanner;


public class Prostokat {

    //program rysuje prostokat

    public void main(String[] args) {

        String wypelnienie;
        boolean errorCheck = true;
        int poz1, poz2, x, y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Jak ci pierdolne prostokat to sie zesrasz!");

        //zbieranie danych

        do {
            if (!errorCheck) {
                System.out.println("Wypelnienie musi byc jednym znakiem\n");
            }
            System.out.println("Podaj znak z jakiego zrobic prostokat: ");
            errorCheck = (false);
            wypelnienie = reader.next();
        } while (wypelnienie.length() != 1);
        errorCheck = true;

        do {
            if (!errorCheck) {
                System.out.println("Koordy musza Łbyc wieksze niz 0\n");
            }

            System.out.println("Podaj koordy lewego gornego rogu\nPierwsza liczba: ");
            poz1 = reader.nextInt();
            System.out.println("Druga liczba");
            poz2 = reader.nextInt();
            errorCheck = false;
        } while (poz1 == 0 || poz2 == 0);

        errorCheck = true;

        do {
            if (!errorCheck) {
                System.out.println("Dlugosci bokow musza byc wieksze niz 0\n");
            }

            System.out.println("Podaj dlugosci bokow prostokata\nPierwszy bok: ");
            x = reader.nextInt();
            System.out.println("Drugi bok");
            y = reader.nextInt();
            errorCheck = false;

        } while (x == 0 || y == 0);

        //budowanie prostokata

        for (int i = 0; i < poz2; i++) {
            System.out.print("\n");
        }

        for (int i = 0; i < x; i++) {

            for (int z = 0; z < poz1; z++) {
                System.out.print("_");
            }

            for (int q = 0; q < y; q++) {
                System.out.print(wypelnienie);
            }
            System.out.print("\n");
        }
    }
}