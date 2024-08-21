package com.optimissa.entidades;

public class YessPersona extends Persona implements Trabajable, Estudiable {

  private String titulo;

  public YessPersona(String name, int edad, String titulo) {
    super(name);
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
    System.out.println("Hola, me llamo " + this.getNombre() + " y soy " + this.getTitulo());
  }

  @Override
  public void trabajar() {
    System.out.println("Hola, me llamo " + this.getNombre() + " y estoy trabajando...");
  }

  @Override
  public void estudiar() {
    System.out.println("Hola, me llamo " + this.getNombre() + " y estoy estudiando...");
  }
}
