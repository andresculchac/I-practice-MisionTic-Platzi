public class MathOperations {

    public static void main(String[] args) {

        double x; //The function Double their use is for math precision
        double y;
        double z;
        double j;
        double q;


        j = 4;
        q = 3;
        x = 2.1;
        y = 3;
        z = 2;


        System.out.println(Math.PI);
        System.out.println(Math.ceil(x));   //round to the next number
        System.out.println(Math.floor(x));  //round to the nearest first number
        System.out.println(Math.pow(y,3));  //pow
        System.out.println(Math.sqrt(z));   //math sqrt

        //Area of a circle
        // A = πr2
        System.out.println(Math.PI * Math.pow(y,2));

        //Area of a sphere  The radio is redundant I implement functions
        // A=4πr2
        System.out.println((4 * Math.PI)*Math.pow(y,2));

        //Volume of a sphere
        // V=4/3 πr3

        System.out.println((4/3) * Math.PI * Math.pow(y,3));
        System.out.println((j/q)*Math.PI*Math.pow(y,3));
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
        System.out.println((4 * Math.PI) * Math.pow(y,2));





    }

}
