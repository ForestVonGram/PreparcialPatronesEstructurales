package org.designPatterns;

public class SistemaArchivosNubeImpl implements SistemaArchivosNube {
    public void subirArchivoNube(String nombreArchivo) {
        System.out.println("Archivo: " + nombreArchivo + " subido al sistema de archivos en la nube.");
    }
    public void borrarArchivoNube(String nombreArchivo) {
        System.out.println("Archivo: " + nombreArchivo + " borrado del sistema de archivos en la nube.");
    }
}
