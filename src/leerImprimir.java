import java.util.Scanner;

public class leerImprimir {
    public static void main(String[] args) {
        String  nombre;
        String apellido1;
        String apellido2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre  = scanner.nextLine();

        System.out.println("Ingresa tu apellido");
        apellido1 = scanner.nextLine();

        System.out.println("Ingresa tu segundo apellido");
        apellido2 = scanner.nextLine();

        System.out.println("Hola "+nombre+" "+apellido1+" "+apellido2);
    }
}
