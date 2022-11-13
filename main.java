public class main {

    public static void main(String [] args){
        int cantidad_usuario = -1; //Valor pedido al usuario para retirar del cajero
        int valor_billete = -1; //Valor asignado al billete para usarlo en el cajero
        int cantidad_billetes = -1; //Valor para almacenar la cantidad de billetes que devuelve el método devolver_billetes de la clase Cajero
        String mensaje = "Introduce la cantidad de dinero a sacar"; //Mensaje para utilizar con pedirDinero de la clase Cajero
        cantidad_usuario = Cajero.pedirDinero(mensaje); //Solicitamos un valor entero al usuario
        if (cantidad_usuario >=5 && (cantidad_usuario%5)==0) { //Comprobamos que el valor es posible de devolver con billetes. Mayor que 5 y múltiplo de 5
            for (int i = 0; i < 7; i++) {
                switch (i) { //El switch modificará el valor del billete en cada vuelta, así para i=0, valor=500, i=1, valor=200, etc.
                    case 0:
                        valor_billete = 500;
                        break;
                    case 1:
                        valor_billete = 200;
                        break;
                    case 2:
                        valor_billete = 100;
                        break;
                    case 3:
                        valor_billete = 50;
                        break;
                    case 4:
                        valor_billete = 20;
                        break;
                    case 5:
                        valor_billete = 10;
                        break;
                    case 6:
                        valor_billete = 5;
                        break;
                    default:
                        System.out.println("Error, aquí no debería llegar"); //Mensaje de control por si algo falla en el bucle
                        break;
                }
                cantidad_billetes = Cajero.devolver_billetes(valor_billete, cantidad_usuario); //Llamamos al método devolver_billetes con el valor y la cantidad correspondiente
                System.out.println(cantidad_billetes + " billetes de " + valor_billete + "€"); //Mostramos los billetes
                cantidad_usuario = cantidad_usuario - (cantidad_billetes * valor_billete); //Reducimos la cantidad que solicitaba el usuario para optimizar el valor
            }
        }else{
            System.out.println("La cantidad introducida no es correcta");
        }
    }
}
