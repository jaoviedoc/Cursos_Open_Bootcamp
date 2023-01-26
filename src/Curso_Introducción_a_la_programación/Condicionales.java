package Curso_Introducción_a_la_programación;

public class Condicionales {
/*
    public static void main(String[] args){
        String estacion ="primavera";

        if (estacion == "primavera"){
            System.out.println("Es primavera");
        } else if (estacion == "verano"){
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación...");
        }
    }

    public static void main(String[] args){
        int contador = 12;

        while (contador > 0){
            System.out.println(contador);
            contador = contador -1;
        }
    }

    public static void main(String[] args){
        int contador = 12;

        do {
            System.out.println(contador);
            contador = contador -1;
        } while (contador >2);
    }


    public static void main(String[] args){
        for(int contador = 1; contador <= 10; contador ++){
            System.out.println(contador);
        }
    }

    public static void main(String[] args){
        //int valores[] = new int[5];
        int valores[] = { 10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
 */

    public static void main(String[] args){
        var estacion = "VERANO";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(estacion);
        }
    }
}
