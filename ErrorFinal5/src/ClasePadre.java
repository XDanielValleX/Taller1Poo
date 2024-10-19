/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
class ClasePadre {

    protected void metodoProtegido() {
        System.out.println("Método protegido.");
    }
}

// Clase hija que puede acceder al método protegido
class ClaseHija extends ClasePadre {

    public void usarMetodoProtegido() {
        metodoProtegido();
    }
}

// Clase en el mismo paquete que puede acceder al método protegido
class MismaPaquete {

    public void llamarMetodo() {
        ClasePadre padre = new ClasePadre();
        padre.metodoProtegido();
    }
}