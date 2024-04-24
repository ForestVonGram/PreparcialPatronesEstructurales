package org.bridge;

public class GestorEmpleadosLocal extends GestorEmpleados {
    public GestorEmpleadosLocal(AlmacenamientoDatos almacenamientoDatos) {
        super(almacenamientoDatos);
    }

    public void agregarEmpleado(String nombre, double salario) {
        almacenamientoDatos.guardarEmpleado(nombre, salario);
    }
}
