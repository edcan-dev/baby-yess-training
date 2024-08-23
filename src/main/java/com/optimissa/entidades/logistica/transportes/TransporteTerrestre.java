package com.optimissa.entidades.logistica.transportes;

public class TransporteTerrestre extends Transporte {

  public TransporteTerrestre(String nombre, Integer capacidad) {
    super(nombre, capacidad);
  }

  @Override
  public void enviarPaquetes() {

    if(!this.getPaquetes().isEmpty()) {

      // TODO: Implementar el metodo de envio
      System.out.println("Enviando por tierra");

    } else {
      System.out.println("No hay paquetes en el transporte");
    }
  }

}
