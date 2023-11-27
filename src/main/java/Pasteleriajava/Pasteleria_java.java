package Pasteleriajava;

import java.util.ArrayList;
import java.util.Scanner;

class Pastel {
    String nombre;
    double precio;

    public Pastel(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

//Codigo de Implementacion
public class Pasteleria_java {
    public static void main(String[] args) {
        // Crear una lista de pasteles disponibles
        ArrayList<Pastel> pasteles = new ArrayList<>();
        pasteles.add(new Pastel("Pastel de Chocolate", 12.99));
        pasteles.add(new Pastel("Pastel de Fresa", 14.99));
        pasteles.add(new Pastel("Pastel de Vainilla", 11.99));
        pasteles.add(new Pastel("Pastel de Manzana", 13.99));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la pastelería. Puede buscar pasteles ingresando letras.");
        String busqueda;

        do {
            System.out.print("Ingrese las letras de su búsqueda (o 'salir' para terminar): ");
            busqueda = scanner.nextLine().toLowerCase();

            if (!busqueda.equalsIgnoreCase("salir")) {
                buscarPasteles(pasteles, busqueda);
            }
        } while (!busqueda.equalsIgnoreCase("salir"));
    }

    private static void buscarPasteles(ArrayList<Pastel> pasteles, String busqueda) {
        System.out.println("Resultados para '" + busqueda + "':");

        for (Pastel pastel : pasteles) {
            if (pastel.nombre.toLowerCase().contains(busqueda)) {
                System.out.println(pastel.nombre + " - $" + pastel.precio);
            }
        }
    }
}
   

