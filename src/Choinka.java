import java.util.Scanner;

public class Choinka {

    //program rysujący choinke

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int n = 0;
        int y = 1;
        boolean errorCheck = true;

        do {
            if (!errorCheck) {
                System.out.println("Wysokosc musi byc wieksza niz 0\n");
            }
            System.out.println("Podaj wysokosc choinki: ");
            errorCheck = (false);
            n = reader.nextInt();
        } while (n < 1);

        //budowanie choinki

        do {  //petla jednej linijki

            for (int x = n - 1; x > -1; x--) {    //petla spacji (x)
                System.out.print(" ");
            }
            for (int i = 0; i < y; i++) {    //petla gwiazdek (y)
                System.out.print("*");
            }
            System.out.print("\n");
            n--;
            y = y + 2;
        } while (n > 0);

    }
}
