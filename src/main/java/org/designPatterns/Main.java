package org.designPatterns;

public class Main {
    public static void main(String[] args) {
        SistemaArchivosLocal sistemaArchivosLocal = new SistemaArchivosLocalImpl();
        SistemaArchivosNube sistemaArchivosNube = new SistemaArchivosNubeImpl();

        SistemaArchivos adaptador = new AdaptadorSistemaArchivos(sistemaArchivosLocal, sistemaArchivosNube);

        FachadaSistemaArchivos fachada = new FachadaSistemaArchivos(adaptador);

        fachada.guardarArchivo("archivo.txt");
        fachada.eliminarArchivo("archivo.txt");
    }
}
