public class SwitchStatement {
    /**
     * Description: Is a function that convert USD to COP
     * @param quantityUSD quantity in USD
     * @param typeOfMoney Type of currency: The parameter only allow MXN or COP
     * @return quantityUSD Return the quantity latest in USD
     *
     * */

    public static double converToDolar(double quantityUSD, String typeOfMoney ){

        switch (typeOfMoney){
            case "COP":
                quantityUSD = quantityUSD * 0.00024;
                break;

            case "MXN":
                quantityUSD = quantityUSD * 0.049;

                break;
        }
        return quantityUSD;
    }



    public static void main(String[] args) {
        String colorMode = "Light";
        System.out.println("COP to USD: " + converToDolar(1000, "COP"));
        switch (colorMode){
            case "Light":
            System.out.println("You choose the light mode");
            break;
            case "Dark":
            System.out.println("You choose the dark mode");
            case "BlueDark":
            System.out.println("You choose the Blue Dark mode");
            break;
        }

    }
}






