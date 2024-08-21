package com.optimissa.entidades;

public class YessPersona extends Persona implements Trabajable, Estudiable {

  private String titulo;

  public YessPersona(String name, int edad, String titulo) {
    super(name, edad);
    this.titulo = titulo;
  }


  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }


  @Override
  public void saludar() {
    System.out.println("Hola, me llamo " + this.getName() + ", tengo " + this.getEdad() + " años y soy " + this.getTitulo());
  }

  @Override
  public void trabajar() {
    System.out.println("Hola, me llamo " + this.getName() + " y estoy trabajando...");
  }

  @Override
  public void estudiar() {
    System.out.println("Hola, me llamo " + this.getName() + " y estoy estudiando...");
  }
}
