package com.optimissa.entidades.logistica;

import java.util.List;

public class DestinatarioLogistica extends PersonaLogistica {

  public DestinatarioLogistica(String nombre) {
    super(nombre);
  }

  @Override
  public void saludar() {
    System.out.println("Soy un remitente!");
  }

}
