package org.decorator;

public class Suma implements OperacionAritmetica{
    @Override
    public double realizarOperacion(double num1, double num2) {
        return num1 + num2;
    }
}
