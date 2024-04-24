package org.decorator;

public class Multiplicacion extends Decorador {
    public Multiplicacion(OperacionAritmetica operacion) {
        super(operacion);
    }

    @Override
    public double realizarOperacion(double num1, double num2) {
        double resultadoBase = operacion.realizarOperacion(num1, num2);
        return resultadoBase * num2;
    }
}
