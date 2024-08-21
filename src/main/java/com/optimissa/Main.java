package com.optimissa;

import com.optimissa.entidades.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

  public static void main(String[] args) {

    YessPersona yessBebe = new YessPersona("Yesenia", 23, "Ingenieria");
    EdgarPersona edgarBebe = new EdgarPersona("Edgar", 22);

    List<Persona> listaDePersonas = new ArrayList<>();
    listaDePersonas.add(yessBebe);
    listaDePersonas.add(edgarBebe);

    listaDePersonas.forEach(persona -> {

      if(persona instanceof YessPersona) {
        YessPersona yessPersona = (YessPersona) persona;
        System.out.println("Soy " + yessPersona.getName() + " y soy " + yessPersona.getTitulo());
      }
      if(persona instanceof EdgarPersona) {
        EdgarPersona edgarPersona = (EdgarPersona) persona;
        System.out.println("Soy " + edgarPersona.getName() + " y no tengo titulo");
      }

    });

  }
}