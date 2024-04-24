package org.decorator;

public class Main {
    public static void main(String[] args) {
        OperacionAritmetica suma = new Suma();
        System.out.println("Suma: " + suma.realizarOperacion(5,3));

        OperacionAritmetica resta = new Resta(suma);
        System.out.println("Suma con resta: " + resta.realizarOperacion(5,3));

        OperacionAritmetica multiplicacion = new Multiplicacion(suma);
        System.out.println("Suma con multiplicación: " + multiplicacion.realizarOperacion(5,3));

        OperacionAritmetica division = new Division(suma);
        System.out.println("Suma con division: " + division.realizarOperacion(5,3));
    }
}
