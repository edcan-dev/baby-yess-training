package com.optimissa.entidades.logistica.transportes;

public class TransporteAereo extends Transporte {

  public TransporteAereo(String transporteNombre, Integer transporteCapacidad) {
    super(transporteNombre, transporteCapacidad);
  }

  @Override
  public void enviarPaquetes() {

    if(!this.getPaquetes().isEmpty()) {

      // TODO: Implementar el metodo de envio
      System.out.println("Enviando por aire");

    } else {
      System.out.println("No hay paquetes en el transporte");
    }
  }
}
