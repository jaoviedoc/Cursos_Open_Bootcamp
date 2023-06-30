package com.example;

public class TipoDatos {
    public static void main(String[] args) {
        // 1. Numericos
        // 1.1 enteros
        byte number1 = 1;
        short number2 = 2;
        int number3 = 3;
        long number4 = 4;

        System.out.println("Tipo de dato byte: " + number1);
        System.out.println("Tipo de dato short: " + number2);
        System.out.println("Tipo de dato int: " + number3);
        System.out.println("Tipo de dato long: " + number4);

        // 1.2 decimales
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        System.out.println("Tipo de dato float: " + decimal1);
        System.out.println("Tipo de dato double: " + decimal2);

        // 2. Booleano
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("Tipo de dato boolean: " + verdadero);
        System.out.println("Tipo de dato boolean: " + falso);


        // 3. Texto
        // 3.1 caracter
        char caracter1 = 'a';

        System.out.println("Tipo de dato char: " + caracter1);

        // 3.2 cadenas de texto
        String nombre = "Jaime";
        String apellido = "Oviedo";

        System.out.println("Tipo de dato String: " + nombre + " " + apellido);

    }
}
