package com.optimissa.entidades.logistica.personas;

public class RemitenteLogistica extends PersonaLogistica {

  public RemitenteLogistica(String nombre) {
    super(nombre);
  }

  @Override
  public void saludar() {
    System.out.println("Soy un remitente!");
  }

}
