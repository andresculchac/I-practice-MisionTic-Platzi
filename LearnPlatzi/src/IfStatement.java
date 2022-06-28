public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;
        if(isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("Archivo Enviado");
        }
        else {
            fileSended--;
            System.out.println("Enciende el bluetooth");
        }
        System.out.println(fileSended);
    }
}
