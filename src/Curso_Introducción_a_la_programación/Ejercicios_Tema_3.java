package Curso_Introducción_a_la_programación;

public class Ejercicios_Tema_3 {
    public static void main (String[] args){

        System.out.print("Primera parte: ");
        int Resultado = Suma_Tres_Parametros(1,2, 3);
        System.out.println(Resultado);

        System.out.print("Segunda parte: ");
        Coche Mi_Coche = new Coche();
        Mi_Coche.Incremento_Puerta();
        System.out.println(Mi_Coche.Puertas);
    }
    public static int Suma_Tres_Parametros(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    public int Puertas = 0;

    public void Incremento_Puerta(){
        this.Puertas++;
    }
}