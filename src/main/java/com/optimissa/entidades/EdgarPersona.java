package com.optimissa.entidades;

public class EdgarPersona extends Persona implements Trabajable {

  public EdgarPersona(String name) {
    super(name);
  }

  @Override
  public void saludar() {
    System.out.println("Hola, me llamo " + this.getNombre());
  }

  @Override
  public void trabajar() {
    System.out.println("Hola, me llamo " + this.getNombre() + " y  estoy trabajando...");
  }
}
