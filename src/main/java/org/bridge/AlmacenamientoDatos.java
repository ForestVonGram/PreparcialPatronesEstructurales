package org.bridge;

public interface AlmacenamientoDatos {
    void guardarEmpleado(String nombre, double salario);
    String buscarEmpleado(String nombre);
    double calcularSalarioTotal();
}
