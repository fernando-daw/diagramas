import java.util.Scanner;

public class cajero {
    int desglose = 0;

    public void retirada() {
        Scanner cubrir = new Scanner(System.in);
        System.out.println("Cantidad a retirar: ");
        desglose = cubrir.nextInt();
        if (desglose >= 5) {
            System.out.println("Su Cantidad a retirar es: " + desglose);

        } else {
            System.out.println("Cantidad a retirar erronea: ");
        }
    }

    public void cantidad() {
        int quinientos = 0, doscientos = 0, cien = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0;

        quinientos = desglose / 500;
        desglose = desglose - (quinientos * 500);

        doscientos = desglose / 200;
        desglose = desglose - (doscientos * 200);

        cien = desglose / 100;
        desglose = desglose - (cien * 100);

        cincuenta = desglose / 50;
        desglose = desglose - (cincuenta * 50);

        veinte = desglose / 20;
        desglose = desglose - (veinte * 20);

        diez = desglose / 10;
        desglose = desglose - (diez * 10);

        cinco = desglose / 5;
        desglose = desglose - (cinco * 5);


        if (quinientos > 0) {
            System.out.println("Billetes de 500: " + quinientos);
        }
        if (doscientos > 0) {
            System.out.println("Billetes de 200: " + doscientos);
        }
        if (cien > 0) {
            System.out.println("Billetes de 100: " + cien);
        }
        if (cincuenta > 0) {
            System.out.println("Billetes de 50: " + cincuenta);
        }
        if (veinte > 0) {
            System.out.println("Billetes de 10: " + veinte);
        }
        if (diez > 0) {
            System.out.println("Billetes de 20: " + diez);
        }
        if (cinco > 0) {
            System.out.println("Billetes de 5: " + cinco);
        }
    }


}
