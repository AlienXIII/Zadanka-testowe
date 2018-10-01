import java.util.Scanner;

public class SumaCiagu {

    //program do testowania petli

    public void main(String[] args) {

        int x, y, i, suma, suma2, suma3;

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        x = reader.nextInt();
        System.out.println("Podaj druga liczbe (wieksza od pierwszej): ");

        do {
            y = reader.nextInt();
        } while (y < x);

        suma = x;
        i = x;  //zmienna i jest po to by korzystac z, ale w niego nie ingerowac

        //petla while
        while (y > i) { //tak dlugo jak dlugo jest mniejsza od x
            i++;       //az w koncu sie zrownaja
            suma = suma + i;
        }
        System.out.println(suma);

        suma2 = x;
        i = x;

        //petla do..while

        do {    //rob sie tak dlugo...
            i++;
            suma2 = suma2 + i;
        } while (i < y);  //...jak dlugo jest mniejsza od y

        System.out.println(suma2);

        suma3 = 0;
        i = x;

        //petla for
        for (i = x; i < y || i == y; i++) { //rob sie tak dlugo jak dlugo i jest mniejsze badz rowne y
            suma3 = suma3 + i;
        }
        System.out.println(suma3);

    }
}