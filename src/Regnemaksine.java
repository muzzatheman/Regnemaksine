import java.util.Scanner;
import java.lang.String;

public class Regnemaksine {
    public static void main(String[] args) {
        System.out.println("Indtast venligst dine værdier her:");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float f = input.nextFloat();
        String username = input.nextLine();
        input.close();

        
        System.out.println("Subtraktion: " + (a-f));
        System.out.println("Multiplikation: " + (a*f));
        System.out.println("Division: " + (a/f));
        System.out.println("Modulus: " + (a%f));
        System.out.println("sqrt x: " + Math.pow(a,f));
        System.out.println("Procent: " + (a/f)*100);

    }
}
