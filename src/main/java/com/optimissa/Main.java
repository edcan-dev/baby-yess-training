package com.optimissa;

import com.optimissa.entidades.*;
import com.optimissa.entidades.logistica.DestinatarioLogistica;
import com.optimissa.entidades.logistica.Paquete;
import com.optimissa.entidades.logistica.RemitenteLogistica;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("===== SISTEMA DE LOGÍSTICA =====");

    System.out.print("Ingrese el nombre del remitente: ");
    String remitenteNombre = scanner.nextLine();
    System.out.print("Ingrese el nombre del paquete: ");
    String paqueteNombre = scanner.nextLine();
    System.out.print("Ingrese el origen del paquete: ");
    String paqueteOrigen = scanner.nextLine();

    System.out.print("Ingrese el nombre del destinatario: ");
    String destinatarioNombre = scanner.nextLine();
    System.out.print("Ingrese el destino del paquete: ");
    String paqueteDestino = scanner.nextLine();

    if(Objects.equals(destinatarioNombre, remitenteNombre)) {
      System.out.println("El destinatario no puede ser la misma persona que el remitente");
      return;
    }

    RemitenteLogistica remitente = new RemitenteLogistica(remitenteNombre);
    DestinatarioLogistica destinatario = new DestinatarioLogistica(destinatarioNombre);

    Paquete paquete = new Paquete(paqueteNombre, paqueteOrigen, paqueteDestino);

    remitente.setPaquetes(List.of(paquete));
    destinatario.setPaquetes(List.of(paquete));

    remitente.mostrarPaquetes();
    destinatario.mostrarPaquetes();

  }
}