/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dentro del mismo paquete
        MismaPaquete ejemploMismaPaquete = new MismaPaquete();
        ejemploMismaPaquete.llamarMetodo();

        // Desde una subclase
        ClaseHija hija = new ClaseHija();
        hija.usarMetodoProtegido();
    }

}
