/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */

// Clase final que no puede ser heredada
final class Constante {

    public final int valor = 42;

    // Método final que no puede ser sobrescrito
    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

// Error "Cannot inherit from final class 'Constante'" (no se puede Heredar)

// class SubConstante extends Constante {
