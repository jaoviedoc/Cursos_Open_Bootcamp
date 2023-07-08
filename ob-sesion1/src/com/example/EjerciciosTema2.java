package com.example;
import java.util.Scanner;

public class EjerciciosTema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double precioConIVA = calcularPrecioConIVA(numero);
        System.out.println("El precio con IVA es: $" + precioConIVA);
    }

    static double calcularPrecioConIVA(double precio) {
        double iva = 0.19;
        return precio * (1 + iva);
    }
}