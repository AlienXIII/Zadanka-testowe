import java.util.Scanner;

public class HighestNumberOfThree {


    //program sprawdza ktora z trzech podanych liczb jest najwieksza
    //a ktora najmniejsza

    public void main(String[] args) {
        int pierwsza, druga, trzecia;

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        pierwsza = reader.nextInt();
        System.out.println("Podaj druga liczbe: ");
        druga = reader.nextInt();
        System.out.println("Podaj trzecia liczbe: ");
        trzecia = reader.nextInt();
        reader.close();
        int low = Math.min(pierwsza, Math.min(druga, trzecia));
        int high = Math.max(pierwsza, Math.max(druga, trzecia));

        System.out.println("Highest number is: " + high);
        System.out.println("Lowest number is: " + low);

    }
}
