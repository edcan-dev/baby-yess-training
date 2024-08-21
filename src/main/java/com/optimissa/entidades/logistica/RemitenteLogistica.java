package com.optimissa.entidades.logistica;

import java.util.List;

public class RemitenteLogistica extends PersonaLogistica {

  public RemitenteLogistica(String nombre) {
    super(nombre);
  }

  @Override
  public void saludar() {
    System.out.println("Soy un remitente!");
  }

}
