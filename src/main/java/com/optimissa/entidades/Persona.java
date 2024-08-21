package com.optimissa.entidades;

public abstract class Persona {

  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setnombre(String nombre) {
    this.nombre = nombre;
  }

  public abstract void saludar();
}