public class FunctionsWithMathOperations {
    public static void main(String[] args) {
        double y;
        double j;
        double q;
        y = 3;
        j = 4;
        q = 3;
        //Area of a circle
        // A = πr2
        double area = circleArea(y);
        System.out.println(circleArea(y));


        //Area of a sphere  The radio is redundant I implement functions
        // A=4πr2
        System.out.println((4 * Math.PI)*Math.pow(y,2));
        System.out.println(sphereArea(3));

        //Volume of a sphere
        // V=4/3 πr3

        System.out.println((4/3) * Math.PI * Math.pow(y,3));
        System.out.println(sphereVolume(3));

    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea (double r){
        return (4 * Math.PI)*Math.pow(r,2);
    }
    public static double sphereVolume(double r){
    return (4/3) * Math.PI * Math.pow(r,3);
    }



}
