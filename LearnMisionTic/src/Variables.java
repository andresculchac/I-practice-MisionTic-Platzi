import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        boolean Rain = false;
        boolean covid = false;

        if (Rain || covid){
            System.out.println("i'm good");
        }
        else {
            System.out.println("You cannot leave to the street");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scan.next();
        System.out.println("Welcome " + name);


        System.out.println("What's is your age");
        int age = scan.nextInt();
        System.out.println(age);


    }
}
