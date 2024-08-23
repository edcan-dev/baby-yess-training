package com.optimissa.servicios;

import com.optimissa.entidades.logistica.paquetes.Paquete;
import com.optimissa.entidades.logistica.personas.DestinatarioLogistica;
import com.optimissa.entidades.logistica.personas.PersonaLogistica;
import com.optimissa.entidades.logistica.personas.RemitenteLogistica;
import com.optimissa.entidades.logistica.transportes.Transporte;
import com.optimissa.entidades.logistica.transportes.TransporteAereo;
import com.optimissa.entidades.logistica.transportes.TransporteMaritimo;
import com.optimissa.entidades.logistica.transportes.TransporteTerrestre;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class LogisticaServicio {

  private static Scanner scanner = new Scanner(System.in);

  public static void iniciarLogistica() {

    System.out.println("===== SISTEMA DE LOGÍSTICA =====");

    List<PersonaLogistica> usuarios = registrarYObtenerUsuarios();

    if(usuarios == null) return;

    Paquete paquete = registrarYObtenerPaquete();
    configurarPaquetesDelUsuario(usuarios, paquete);

    Transporte transporte = registrarYObtenerTransporte();

    configurarPaqueteParaElTransporte(transporte, paquete);

    enviarPaquete(paquete, usuarios, transporte);

  }


  private static void configurarPaquetesDelUsuario(List<PersonaLogistica> usuarios, Paquete paquete) {
    RemitenteLogistica remitenteLogistica = (RemitenteLogistica) usuarios.get(0);
    DestinatarioLogistica destinatarioLogistica = (DestinatarioLogistica) usuarios.get(1);

    remitenteLogistica.setPaquetes(List.of(paquete));
    destinatarioLogistica.setPaquetes(List.of(paquete));
  }

  private static List<PersonaLogistica> registrarYObtenerUsuarios() {
    // Registro de usuarios
    System.out.print("Ingrese el nombre del remitente: ");
    String remitenteNombre = scanner.nextLine();
    System.out.print("Ingrese el nombre del destinatario: ");
    String destinatarioNombre = scanner.nextLine();

    if(Objects.equals(destinatarioNombre, remitenteNombre)) {
      System.out.println("El destinatario no puede ser la misma persona que el remitente");
      return null;
    }
    RemitenteLogistica remitente = new RemitenteLogistica(remitenteNombre);
    DestinatarioLogistica destinatario = new DestinatarioLogistica(destinatarioNombre);
    return new ArrayList<>(List.of(remitente, destinatario));
  }

  private static Paquete registrarYObtenerPaquete() {

    // Registro del paquete
    System.out.println("================================================");
    System.out.println("================================================");
    System.out.print("Ingrese el nombre del paquete: ");
    String paqueteNombre = scanner.nextLine();
    System.out.print("Ingrese el origen del paquete: ");
    String paqueteOrigen = scanner.nextLine();
    System.out.print("Ingrese el destino del paquete: ");
    String paqueteDestino = scanner.nextLine();
    return new Paquete(paqueteNombre, paqueteOrigen, paqueteDestino);
  }

  private static Transporte registrarYObtenerTransporte() {
    // Registro del trasporte
    System.out.println("================================================");
    System.out.println("================================================");
    System.out.print("Ingrese el nombre del transporte: ");
    String transporteNombre = scanner.nextLine();
    System.out.print("Ingrese la capacidad del transporte: ");
    Integer transporteCapacidad = scanner.nextInt();

    System.out.println("Seleccione el tipo de transporte:");
    System.out.println("1. Terrestre");
    System.out.println("2. Aéreo");
    System.out.println("3. Marítimo");
    int opcion = scanner.nextInt();

    Transporte transporte = null;
    switch (opcion) {
      case 1:
        transporte = new TransporteTerrestre(transporteNombre, transporteCapacidad);
        break;
      case 2:
        transporte = new TransporteAereo(transporteNombre, transporteCapacidad);
        break;
      case 3:
        transporte = new TransporteMaritimo(transporteNombre, transporteCapacidad);
        break;
      default:
        System.out.println("La opcion en incorrecta");
    }
    return transporte;
  }

  private static void configurarPaqueteParaElTransporte(Transporte transporte, Paquete paquete) {
    transporte.agregarPaquete(paquete);
  }

  private static void enviarPaquete(Paquete paquete, List<PersonaLogistica> usuarios, Transporte transporte) {
    // TODO: Implementar el metodo enviarPaquete
    RemitenteLogistica remitente = (RemitenteLogistica) usuarios.get(0);
    DestinatarioLogistica destinatario = (DestinatarioLogistica) usuarios.get(1);
    transporte.enviarPaquetes();
    System.out.println("Información del envío");
    System.out.println("El usuario " + remitente .getNombre() + " de " + paquete.getOrigen() + " envío el paquete " + paquete.getNombre() + " a el usuario " + destinatario .getNombre() + " con destino a " + paquete.getDestino() + " utilizando el transporte " + transporte.getNombre() + ".");

  }

}
