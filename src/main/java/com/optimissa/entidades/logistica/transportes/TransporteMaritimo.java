package com.optimissa.entidades.logistica.transportes;

public class TransporteMaritimo extends Transporte {
    public TransporteMaritimo(String nombre, Integer capacidad) {super(nombre, capacidad); }

    @Override
    public void enviarPaquetes() {

        if(!this.getPaquetes().isEmpty()) {

            System.out.println("Enviando por Mar");

        } else {
            System.out.println("No hay paquetes en el transporte");
        }
    }

}
