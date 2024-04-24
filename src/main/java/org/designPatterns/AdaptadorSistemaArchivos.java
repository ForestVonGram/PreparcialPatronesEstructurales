package org.designPatterns;

public class AdaptadorSistemaArchivos implements SistemaArchivos {
    private SistemaArchivosLocal sistemaArchivosLocal;
    private SistemaArchivosNube sistemaArchivosNube;

    public AdaptadorSistemaArchivos(SistemaArchivosLocal sistemaArchivosLocal, SistemaArchivosNube sistemaArchivosNube) {
        this.sistemaArchivosLocal = sistemaArchivosLocal;
        this.sistemaArchivosNube = sistemaArchivosNube;
    }

    public void guardarArchivo(String nombreArchivo) {
        sistemaArchivosLocal.guardarArchivoLocal(nombreArchivo);
        sistemaArchivosNube.subirArchivoNube(nombreArchivo);
    }

    public void eliminarArchivo(String nombreArchivo) {
        sistemaArchivosLocal.eliminarArchivoLocal(nombreArchivo);
        sistemaArchivosNube.borrarArchivoNube(nombreArchivo);
    }
}
