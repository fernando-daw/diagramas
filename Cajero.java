import java.util.Scanner;

public class Cajero {

    static Scanner entrada = new Scanner(System.in); //Variable de clase, solo accesible por los miembros de la clase Cajero

    /**
     * Método para recoger valores enteros
     * @param mensaje Parámetro de entrada que indica el mensaje a mostrar al usuario para solicitarle una cantidad
     * @return Devuelve el valor solicitado
     */
    public static int pedirDinero(String mensaje){
            int valor = 0;
            System.out.println(mensaje);
            valor = entrada.nextInt();
            return valor;
    }

    /**
     * Método para calcular la cantidad de billetes que deben devolverse
     * @param valor_billete El valor del billete a calcular
     * @param cantidad La cantidad a retirar o restante
     * @return La cantidad de billetes que se devuelven
     */
    public static int devolver_billetes(int valor_billete, int cantidad){
        int billetes = 0;
        if(valor_billete<=cantidad){
            billetes = cantidad / valor_billete;
        }
        return billetes;
    }



}
