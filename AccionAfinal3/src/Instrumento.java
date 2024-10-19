/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
// Clase abstracta Instrumento
abstract class Instrumento {

    public abstract void tocar();
}

// Interfaz Afinable
interface Afinable {

    void afinar();
}

// Clase Guitarra que extiende Instrumento e implementa Afinable
class Guitarra extends Instrumento implements Afinable {

    @Override
    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está siendo afinada.");
    }
}
