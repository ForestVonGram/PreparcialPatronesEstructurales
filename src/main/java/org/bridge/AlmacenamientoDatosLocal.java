package org.bridge;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoDatosLocal implements AlmacenamientoDatos {
    private Map<String, Double> empleados = new HashMap<>();

    public void guardarEmpleado(String nombre, double salario) {
        empleados.put(nombre, salario);
    }

    public String buscarEmpleado(String nombre) {
        if (empleados.containsKey(nombre)) {
            return nombre+ " : " + empleados.get(nombre);
        }
        else {
            return "Empleado no encontrado.";
        }
    }

    public double calcularSalarioTotal() {
        return empleados.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}
