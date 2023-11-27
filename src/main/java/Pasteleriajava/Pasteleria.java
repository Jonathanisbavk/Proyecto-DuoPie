package Pasteleriajava;

import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a DuoPie, ¿cuál es su nombre?");
        String nombre = input.nextLine();

        System.out.println("Hola, " + nombre + ", elija su pastel:");
        System.out.println("1.- Pasteles de Exhibición");
        System.out.println("2.- Pasteles Temáticos");

        String opcionPastel = input.nextLine();

        Pedido pedido = new Pedido(nombre);

        if (opcionPastel.equals("1")) {
            PastelesDeExhibicion pastelesDeExhibicion = new PastelesDeExhibicion();
            pastelesDeExhibicion.seleccionarPastel(input, pedido);
        } else if (opcionPastel.equals("2")) {
            // Estamos trabajando acá :D
        } else {
            System.out.println("Opción no válida.");
        }

        MetodoDePago metodoDePago = new MetodoDePago();
        metodoDePago.seleccionarMetodoDePago(input, pedido);

        MetodoDeEntrega metodoDeEntrega = new MetodoDeEntrega();
        metodoDeEntrega.seleccionarMetodoDeEntrega(input, pedido);

        System.out.println("Resumen del Pedido:");
        System.out.println(pedido.toString());
    }
}

class Pedido {
    private String nombre;
    private double precioTotal;
    private String resumenPedido;

    public Pedido(String nombre) {
        this.nombre = nombre;
        this.precioTotal = 0.0;
        this.resumenPedido = "";
    }

    public void agregarPrecio(double precio) {
        this.precioTotal += precio;
    }

    public void agregarResumen(String resumen) {
        this.resumenPedido += resumen;
    }

    public String toString() {
        return "Cliente: " + nombre + "\n" + resumenPedido + "Precio Total: S/" + precioTotal + "\n";
    }
}

class PastelesDeExhibicion {
    public void seleccionarPastel(Scanner input, Pedido pedido) {
        System.out.println("¡Excelente elección! Elige uno de estos pasteles de exhibición:");
        System.out.println("1.- Tres Leches - Precio: S/80.00");
        System.out.println("2.- Torta Selva Negra - Precio: S/75.00");
        System.out.println("3.- Torta de Oreo - Precio: S/70.00");

        String opcionPastelex = input.nextLine();
        double precioPastelex = 0.0;

        switch (opcionPastelex) {
            case "1":
                precioPastelex = 80.0;
                pedido.agregarResumen("Pastel Escogido: Tres Leches\nCosto Base: S/80.00\n");
                break;
            case "2":
                precioPastelex = 75.0;
                pedido.agregarResumen("Pastel Escogido: Torta Selva Negra\nCosto Base: S/75.00\n");
                break;
            case "3":
                precioPastelex = 70.0;
                pedido.agregarResumen("Pastel Escogido: Torta de Oreo\nCosto Base: S/70.00\n");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        pedido.agregarPrecio(precioPastelex);

        System.out.println("Elija la cantidad de porciones:");
        System.out.println("1.- 12 porciones");
        System.out.println("2.- 20 porciones");

        String opcionPorciones = input.nextLine();
        double costoPorciones = 0.0;

        if (opcionPorciones.equals("2")) {
            costoPorciones = 50.0;
            pedido.agregarResumen("Porciones: 20\n");
        } else {
            pedido.agregarResumen("Porciones: 12\n");
        }

        pedido.agregarPrecio(costoPorciones);

        TipoCake tipoCake = new TipoCake();
        tipoCake.seleccionarTipoCake(input, pedido);
    }
}

class TipoCake {
    public void seleccionarTipoCake(Scanner input, Pedido pedido) {
        System.out.println("Elige el tipo de cake:");
        System.out.println("1.- Chocolate");
        System.out.println("2.- Vainilla");
        System.out.println("3.- Fresa");

        String opcionTipoCake = input.nextLine();

        switch (opcionTipoCake) {
            case "1":
                pedido.agregarResumen("Tipo de Cake: Chocolate\n");
                break;
            case "2":
                pedido.agregarResumen("Tipo de Cake: Vainilla\n");
                break;
            case "3":
                pedido.agregarResumen("Tipo de Cake: Fresa\n");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        Relleno relleno = new Relleno();
        relleno.seleccionarRelleno(input, pedido);
    }
}

class Relleno {
    public void seleccionarRelleno(Scanner input, Pedido pedido) {
        System.out.println("Elige el relleno:");
        System.out.println("1.- Crema de Chocolate");
        System.out.println("2.- Mermelada de Fresa");
        System.out.println("3.- Crema de Vainilla");

        String opcionRelleno = input.nextLine();

        switch (opcionRelleno) {
            case "1":
                pedido.agregarResumen("Relleno: Crema de Chocolate\n");
                break;
            case "2":
                pedido.agregarResumen("Relleno: Mermelada de Fresa\n");
                break;
            case "3":
                pedido.agregarResumen("Relleno: Crema de Vainilla\n");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        Dedicatoria dedicatoria = new Dedicatoria();
        dedicatoria.seleccionarDedicatoria(input, pedido);
    }
}

class Dedicatoria {
    public void seleccionarDedicatoria(Scanner input, Pedido pedido) {
        System.out.println("Escribe una dedicatoria (o presiona Enter para omitir):");
        String dedicatoria = input.nextLine();

        if (!dedicatoria.isEmpty()) {
            pedido.agregarResumen("Dedicatoria: " + dedicatoria + "\n");
        }
    }
}

class MetodoDePago {
    public void seleccionarMetodoDePago(Scanner input, Pedido pedido) {
        System.out.println("Elija el Método de pago:");
        System.out.println("1.- Efectivo");
        System.out.println("2.- Tarjeta");
        System.out.println("3.- Billetera Digital");

        String opcionMP = input.nextLine();


    }
}

class MetodoDeEntrega {
    public void seleccionarMetodoDeEntrega(Scanner input, Pedido pedido) {
        System.out.println("Elija el Método de Entrega:");
        System.out.println("1.- Recogo en Tienda");
        System.out.println("2.- Delivery");

        String opcionEntrega = input.nextLine();

  
    }
}
