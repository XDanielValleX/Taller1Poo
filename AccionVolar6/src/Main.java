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
        Vehiculo miVehiculo = new Avion();  // Polimorfismo
        miVehiculo.mover();  // Llama al método mover de la clase Avion - Imprime "El avión vuela."
    }
}
