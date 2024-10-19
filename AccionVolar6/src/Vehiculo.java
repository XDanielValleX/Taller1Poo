/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author daniel
 */
// Clase Vehiculo
class Vehiculo {

    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}

// Clase Avion que sobrescribe mover
class Avion extends Vehiculo {

    @Override
    public void mover() {
        System.out.println("El avión vuela.");
    }
}
