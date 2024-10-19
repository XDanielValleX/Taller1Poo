/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
// Clase Animal con un método protegido
class Animal {
    protected String sonido = "Sonido de animal";

    public void hacerSonido() {
        System.out.println(sonido);
    }
}

// Clase Gato que extiende Animal
class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau";  // Uso de super para modificar el atributo
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();  // Llamada al método de la clase padre
        System.out.println("El gato maúlla.");
    }
}