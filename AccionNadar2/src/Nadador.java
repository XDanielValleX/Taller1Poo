/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
// Interfaz Nadador
interface Nadador {
    void nadar();
}

// Clase Pez que implementa Nadador
class Pez implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}