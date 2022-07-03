import java.util.Scanner;

public class ConverToDolar {
    public static void main(String[] args) {
        double USD = 0.00024;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your quantity of COP");
        double COP = scan.nextDouble();

// my challenge is ConverToDolar(string COP MNX , y this convert to USD y not necessary x your value is defined )
        System.out.println("Input your quantity of USD is "+USD * (double) COP);

    }
}
