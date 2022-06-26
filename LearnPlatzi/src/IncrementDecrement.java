public class IncrementDecrement {
    public static void main(String[] args) {

        int lives;
        int gift;

        lives = 5;
        lives = lives - 1;
        lives --;
        lives ++;  //latest result = 4
        System.out.println(lives);

        //prefix
        gift = 100 + lives++;
        System.out.println(gift);  //Here we access to the latest value

        //postfix
        gift = 100 + ++lives;
        System.out.println(gift); //Here we access to the variable



    }
}
