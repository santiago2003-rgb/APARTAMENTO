package org.example;

import org.example.MODELOS.Apartamneto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Apartamneto apartamento = new Apartamneto();

        System.out.println("Digite el nombre de la constructora: ");
        apartamento.setNombreConstructora(lea.nextLine());

        System.out.println("Direccion del apartamento: ");
        apartamento.setDireccion(lea.nextLine());

        System.out.println("Metros cuadrados: ");
        apartamento.setMetroCuadrados(lea.nextDouble());

        System.out.println("Numero de habitaciones: ");
        apartamento.setNumeroHabitaciones(lea.nextInt());

        System.out.println("Tiene balcon: ");
        apartamento.setTieneBalcon(lea.nextBoolean());

        System.out.println(apartamento);

    }
}