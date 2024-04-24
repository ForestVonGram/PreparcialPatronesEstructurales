package org.bridge;

abstract class GestorEmpleados {
    protected AlmacenamientoDatos almacenamientoDatos;

    public GestorEmpleados(AlmacenamientoDatos almacenamientoDatos) {
        this.almacenamientoDatos = almacenamientoDatos;
    }

    public abstract void agregarEmpleado(String nombre, double salario);

    public String buscarEmpleado(String nombre) {
        return almacenamientoDatos.buscarEmpleado(nombre);
    }

    public double calcularSalarioTotal() {
        return almacenamientoDatos.calcularSalarioTotal();
    }
}
