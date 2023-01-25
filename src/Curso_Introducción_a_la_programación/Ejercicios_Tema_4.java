package Curso_Introducción_a_la_programación;

public class Ejercicios_Tema_4 {
    public static void main(String[] args){

        System.out.print("Usando if: ");
        int numeroif = 0;

        if (numeroif > 0){
            System.out.println("El numero es positivo");
        } else if (numeroif < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        System.out.print("Usando While: ");
        int numeroWhile = -1;

        while (numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        System.out.print("Usando Do While: ");
        int NumeroDoWhile = -1;

        do {
            NumeroDoWhile = NumeroDoWhile + 1;
        } while (NumeroDoWhile < 3);
        System.out.println(NumeroDoWhile);

        System.out.print("Usando For: ");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }

        System.out.print("Usando Switch: ");
        var estacion = "VINVIERNO";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println(estacion + " no es una estación");
        }
    }
}
