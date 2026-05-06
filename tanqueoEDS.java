import java.util.Scanner;

public class tanqueoEDS {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        // VARIABLES
        String operador;
        char tipoCombustible;
        double galones;
        double precio;
        double subtotal;
        double iva;
        double total;
        double promedio;

        // ENTRADA
        System.out.print("Nombre del operador: ");
        operador = lector.nextLine();

        System.out.print("Tipo de combustible (C/E/A): ");
        tipoCombustible = lector.next().charAt(0);

        System.out.print("Cantidad de galones: ");
        galones = lector.nextDouble();

        System.out.print("Precio por galón: ");
        precio = lector.nextDouble();

        // PROCESO
        subtotal = galones * precio;
        iva = subtotal * 19 / 100;
        total = subtotal + iva;
        promedio = total / galones;

        // SALIDA
        System.out.print("\n--- RECIBO TANQUEO ---\n");
        System.out.print("Operador: " + operador + "\n");
        System.out.print("Combustible: " + tipoCombustible + "\n");
        System.out.print("Subtotal: $" + subtotal + "\n");
        System.out.print("IVA (19%): $" + iva + "\n");
        System.out.print("Total: $" + total + "\n");
        System.out.print("Promedio por galón: $" + promedio + "\n");

        lector.close();
    }
}
