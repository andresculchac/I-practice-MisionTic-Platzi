import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Choose your favorite option");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 0:
                    System.out.println("Thank You for watched");
                    break;
                case 1:
                    System.out.println("Movies :)");
                    break;
                case 2:
                    System.out.println("Series :)");
                    break;
                default:
                    System.out.println("Choose an option");
            }
        } while (response != 0);
        System.out.println("does the program end  ");
    }
}
