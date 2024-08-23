package com.optimissa.entidades.logistica.transportes;

import com.optimissa.entidades.logistica.paquetes.Paquete;

import java.util.ArrayList;
import java.util.List;

public abstract class Transporte {

  private String nombre;
  private Integer capacidad;
  private List<Paquete> paquetes;

  public Transporte(String nombre, Integer capacidad) {
    this.nombre = nombre;
    this.capacidad = capacidad;
    this.paquetes = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public List<Paquete> getPaquetes() {
    return paquetes;
  }

  public abstract void enviarPaquetes();

  public void agregarPaquete(Paquete paquete) {
    this.paquetes.add(paquete);
  }

  public void describirPaquetes() {
    System.out.println("El transporte " + this.nombre + " tiene una carga de " + this.paquetes.size() + " paquetes, con una capacidad maxima de " + this.capacidad);
  }

}
