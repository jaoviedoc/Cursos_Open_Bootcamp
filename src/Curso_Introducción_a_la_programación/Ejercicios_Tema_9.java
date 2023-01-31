package Curso_Introducción_a_la_programación;

public class Ejercicios_Tema_9 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.edad = 23;
        cliente.nombre = "Jaime";
        cliente.telefono = "+57 320 559 0364";
        cliente.credito = "No tiene";

        System.out.println(cliente.nombre + ", tiene: " + cliente.edad + " años");
        System.out.println("Su telefono es: " + cliente.telefono);
        System.out.println(cliente.credito + " credito");

        System.out.println();

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 25;
        trabajador.nombre = "Alex";
        trabajador.telefono = "+57 323 679 3845";
        trabajador.salario = "$2'000.000";

        System.out.println(trabajador.nombre + ", tiene: " + trabajador.edad + " años");
        System.out.println("Su telefono es: " + trabajador.telefono);
        System.out.println("Gana: " + trabajador.salario);
    }
}

class personas{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends personas{
    String credito;
}

class Trabajador extends personas{
    String salario;
}