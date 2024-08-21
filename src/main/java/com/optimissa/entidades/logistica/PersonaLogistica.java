package com.optimissa.entidades.logistica;

import com.optimissa.entidades.Persona;

import java.util.List;

public abstract class PersonaLogistica extends Persona {

  List<Paquete> paquetes;

  public PersonaLogistica(String nombre) {
    super(nombre);
  }

  public void setPaquetes(List<Paquete> paquetes) {
    this.paquetes = paquetes;
  }
  public List<Paquete> getPaquetes() {
    return paquetes;
  }

  public void mostrarPaquetes() {
    String paquetesStr;

    if(this.paquetes.size() == 1) {
      paquetesStr = "paquete";
    } else {
      paquetesStr = "paquetes";
    }
    if(this.paquetes.isEmpty()) {
      System.out.println("No tengo paquetes!");
    } else {
      System.out.println("Hola, tengo " + paquetes.size() + " " + paquetesStr);
    }
  }
}
