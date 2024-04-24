package org.decorator;

public class Division extends Decorador {
    public Division(OperacionAritmetica operacion) {
        super(operacion);
    }

    @Override
    public double realizarOperacion(double num1, double num2) {
        double resultadoBase = operacion.realizarOperacion(num1, num2);
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return resultadoBase / num2;
    }
}
