package com.optimissa.entidades;

public class EdgarPersona extends Persona implements Trabajable {

  public EdgarPersona(String name, int edad) {
    super(name, edad);
  }

  @Override
  public void saludar() {
    System.out.println("Hola, me llamo " + this.getName() + ", tengo " + this.getEdad() + " años");
  }

  @Override
  public void trabajar() {
    System.out.println("Hola, me llamo " + this.getName() + " y  estoy trabajando...");
  }
}
