import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        double[] myList = {1.2, 2.6, 3.5, 4.9};

        //Array de nombre
        String[] listadenames = {"Vane", "Allan", "Yahaira", "Max"};

        System.out.println("Ingrese nombre de usuario:");
        for (int u = 0; u < listadenames.length; u++) {
            Scanner teclado = new Scanner(System.in);
            nombre = teclado.nextLine();
            if (nombre==listadenames[0]) {

                System.out.println("valid user");
                System.out.println("Sus datos se encuentran cifrados, ingrese contraseña :");

            } else {
                System.out.println("invalid user");

            }

        }
    }
}
