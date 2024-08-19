package com.optimissa;


public class Main {

  public static void main(String[] args) {

    Persona yessBebe = new Persona();
    yessBebe.setName("Yess");
    yessBebe.setEdad(23);

    Persona edgarBebe = new Persona();
    edgarBebe.setName("Edgar");
    edgarBebe.setEdad(22);

    Operaciones operaciones = new Operaciones();

    int resultadoSuma = operaciones.sumar(yessBebe.getEdad(), edgarBebe.getEdad());

    int resultadoResta = operaciones.restar(yessBebe.getEdad(), edgarBebe.getEdad());

    System.out.println("El resultado de la suma es: " + resultadoSuma);
    System.out.println("El resultado de la resta es: " + resultadoResta);

  }
}

class Operaciones {

  public int sumar(int primerValor, int segundoValor) {
    return primerValor + segundoValor;
  }

  public int restar(int primerValor, int segundoValor) {
    return primerValor - segundoValor;
  }
}


class Persona {

  private String name;
  private int edad;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}
class Numero {

  private int valor;

  public Numero(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return this.valor;
  }

}