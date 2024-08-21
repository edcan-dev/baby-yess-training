package com.optimissa.entidades.logistica;

public class Paquete {

  private String nombre;
  private String origen;
  private String destino;

  public Paquete(String nombre, String origen, String destino) {
    this.nombre = nombre;
    this.origen = origen;
    this.destino = destino;
  }

  public String getNombre() {
    return nombre;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }
}
