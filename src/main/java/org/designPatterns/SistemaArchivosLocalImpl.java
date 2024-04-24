package org.designPatterns;

public class SistemaArchivosLocalImpl implements SistemaArchivosLocal {
    public void guardarArchivoLocal(String nombreArchivo) {
        System.out.println("Archivo: " + nombreArchivo + " guardado  en el sistema de archivos local.");
    }
    public void eliminarArchivoLocal(String nombreArchivo) {
        System.out.println("Archivo: " + nombreArchivo + " eliminado en el sistema de archivos local.");
    }
}
