package org.bridge;

public class GestorEmpleadosNube extends GestorEmpleados {
    public GestorEmpleadosNube(AlmacenamientoDatos almacenamientoDatos) {
        super(almacenamientoDatos);
    }

    public void agregarEmpleado(String nombre, double salario) {
        almacenamientoDatos.guardarEmpleado(nombre, salario);
    }
}
