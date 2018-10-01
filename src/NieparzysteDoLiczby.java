import java.util.Scanner;

public class NieparzysteDoLiczby {

    //program sprawdza ile nieparzystych liczb od zera jest na drodze do twojej

    public void main(String[] args) {

        int liczba = 0;

        System.out.println("Podaj parzysta liczbe");
        Scanner reader = new Scanner(System.in);

        do {

            liczba = reader.nextInt();

        } while (liczba % 2 != 0);

        reader.close();
        System.out.println("Liczby nieparzyste od zera do twojej liczby to : ");

        int i = 1;

        do {
            System.out.println(i);
            i = i + 2;
        } while (i < liczba);


    }
}