public class WhileLoop {
    static boolean isTurnOnLight = false;
    // first revise but after eject
    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i<=10){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . . ");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true; // check the simplification
        return isTurnOnLight;
    }
}
