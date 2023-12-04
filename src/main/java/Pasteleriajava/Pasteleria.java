package Pasteleriajava;

import java.util.Scanner;


import java.util.Scanner;

public class Pasteleria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a DuoPie, ¿cuál es su nombre?");
        String nombre = input.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = input.nextLine();

        Cliente cliente = new Cliente(nombre, apellido);

        System.out.println("Hola, " + nombre + " " + apellido + ", elija su pastel:");

        System.out.println("1.- Pasteles de Exhibición");
        System.out.println("2.- Pasteles Temáticos");

        String opcionPastel = input.nextLine();

        Pedido pedido = new Pedido();

        Producto pastelElegido = null;

        if (opcionPastel.equals("1")) {
            pastelElegido = new PastelesDeExhibicion();
        } else if (opcionPastel.equals("2")) {
            pastelElegido = new PastelesTematicos();
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        pastelElegido.seleccionarPastel(input, cliente, pedido);

        MetodoDePago metodoDePago = new MetodoDePago();
        metodoDePago.seleccionarMetodoDePago(input, pedido);

        MetodoDeEntrega metodoDeEntrega = new MetodoDeEntrega();
        metodoDeEntrega.seleccionarMetodoDeEntrega(input, pedido);

        System.out.println("Resumen del Pedido:");
        System.out.println(pedido.toString());
    }
}

class Cliente{
    public String nombre;
    private String apellido;
    private int edad;
    private String genero;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
class Pedido {
    
    private double precioTotal;
    private String resumenPedido;

    public Pedido() {
    }


    public void agregarPrecio(double precio) {
        this.precioTotal += precio;
    }

    public void agregarResumen(String resumen) {
        this.resumenPedido += resumen;
    }
    
    public String obtenernombredecliente(Cliente cliente){
    return cliente.getNombre();
    }

    public String toString() {
        return "\n" + resumenPedido + "Precio Total: S/" + precioTotal + "\n";
    }
}
interface Producto {
    void seleccionarPastel(Scanner input, Cliente cliente, Pedido pedido);
    double obtenerPrecioBase();
}

abstract class Pastel implements Producto {
    protected double precioBase;

    @Override
    public double obtenerPrecioBase() {
        return precioBase;
    }
}

class PastelesTematicos extends Pastel {
    @Override
    public void seleccionarPastel(Scanner input, Cliente cliente, Pedido pedido) {
        
        System.out.println("¡Excelente elección! Elige uno de estos pasteles temáticos:");
        System.out.println("1.- Torta Infantil - Precio: S/80.00");
        System.out.println("2.- Torta Matrimonial - Precio: S/75.00");
        System.out.println("3.- Torta Quinceañera - Precio: S/70.00");

        String opcionPastelex = input.nextLine();

        switch (opcionPastelex) {
            case "1":
                precioBase = 80.0;
                pedido.agregarResumen("Pastel Escogido: Infantil\nCosto Base: S/80.00\n");
                break;
            case "2":
                precioBase = 75.0;
                pedido.agregarResumen("Pastel Escogido: Matrimonial\nCosto Base: S/75.00\n");
                break;
            case "3":
                precioBase = 70.0;
                pedido.agregarResumen("Pastel Escogido: Quinceañera\nCosto Base: S/70.00\n");
                break;
            default:
                System.out.println("Opción no válida.");
                return; 
        }

        pedido.agregarPrecio(precioBase);

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

class PastelesDeExhibicion extends Pastel {
    @Override
    public void seleccionarPastel(Scanner input, Cliente cliente, Pedido pedido) {
        System.out.println("¡Excelente elección! Elige uno de estos pasteles de exhibición:");
        System.out.println("1.- Tres Leches - Precio: S/80.00");
        System.out.println("2.- Torta Selva Negra - Precio: S/75.00");
        System.out.println("3.- Torta de Oreo - Precio: S/70.00");

        String opcionPastelex = input.nextLine();

        switch (opcionPastelex) {
            case "1":
                precioBase = 80.0;
                pedido.agregarResumen("Pastel Escogido: Tres Leches\nCosto Base: S/80.00\n");
                break;
            case "2":
                precioBase = 75.0;
                pedido.agregarResumen("Pastel Escogido: Torta Selva Negra\nCosto Base: S/75.00\n");
                break;
            case "3":
                precioBase = 70.0;
                pedido.agregarResumen("Pastel Escogido: Torta de Oreo\nCosto Base: S/70.00\n");
                break;
            default:
                System.out.println("Opción no válida.");
                return; 
        }

        pedido.agregarPrecio(precioBase);

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
        System.out.println("4.- No gracias");

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
            case "4":
                Dedicatoria dedicatoria = new Dedicatoria();
                dedicatoria.seleccionarDedicatoria(input, pedido);
                return;
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

