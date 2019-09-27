import java.util.Scanner;

public class ErDuMyndig {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int age;
        age = keyb.nextInt();
        if (age<=18)
        System.out.println("Du er ikke gammel nok");
        else
        System.out.println("Tillykke  fødselsdagen Moussa");

    }
}
