package org.bridge;

public class Main {
    public static void main(String[] args) {

        AlmacenamientoDatos almacenamientoLocal = new AlmacenamientoDatosLocal();
        AlmacenamientoDatos almacenamientoNube = new AlmacenamientoDatosLocal();

        GestorEmpleadosLocal gestorEmpleadosLocal = new GestorEmpleadosLocal(almacenamientoLocal);
        GestorEmpleadosNube gestorEmpleadosNube = new GestorEmpleadosNube(almacenamientoNube);

        gestorEmpleadosLocal.agregarEmpleado("Carlos", 200);
        gestorEmpleadosLocal.agregarEmpleado("Luis", 400);
        gestorEmpleadosNube.agregarEmpleado("Sara", 500);

        System.out.println("Empleado Carlos: " + gestorEmpleadosLocal.buscarEmpleado("Carlos"));
        System.out.println("Salario total local: " + gestorEmpleadosLocal.calcularSalarioTotal());

        System.out.println("\n");

        System.out.println("Empleado Sara: " + gestorEmpleadosNube.buscarEmpleado("Sara"));
        System.out.println("Salario total en la nube: " + gestorEmpleadosNube.calcularSalarioTotal());
    }
}
