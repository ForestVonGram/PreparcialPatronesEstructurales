package org.decorator;

abstract class Decorador implements OperacionAritmetica{
    protected OperacionAritmetica operacion;

    public Decorador(OperacionAritmetica operacion) {
        this.operacion = operacion;
    }
}
