package org.designPatterns;

public class FachadaSistemaArchivos {
    private SistemaArchivos sistemaArchivos;
    public FachadaSistemaArchivos(SistemaArchivos sistemaArchivos) {
        this.sistemaArchivos = sistemaArchivos;
    }

    public void guardarArchivo(String nombreArchivo) {
        sistemaArchivos.guardarArchivo(nombreArchivo);
    }

    public void eliminarArchivo(String nombreArchivo) {
        sistemaArchivos.eliminarArchivo(nombreArchivo);
    }
}
