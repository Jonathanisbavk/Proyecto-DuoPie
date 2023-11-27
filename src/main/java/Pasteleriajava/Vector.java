package Pasteleriajava;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Gracias por comprar un pastel!");

        String[] preguntas = {
            "¿Cuál es su nombre? ",
            "¿Del 1 al 10 que le pareció la atención de la pastelería? ",
            "¿Volvería a comprar en esta pastelería? ",
            "¿Recomendaría la pastelería? (Sí/No) "
        };

        String[] respuestas = new String[preguntas.length];

        for (int i = 0; i < preguntas.length; i++) {
            System.out.print(preguntas[i]);
            respuestas[i] = scanner.nextLine();
        }

        System.out.println("\n¡Gracias por su compra! ¡Tenga un buen día!");
        System.out.println("\nResumen de respuestas:");

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i] + respuestas[i]);
        }
    }
}
