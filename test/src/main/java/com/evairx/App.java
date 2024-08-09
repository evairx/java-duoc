package com.evairx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Funcciones fun = new Funcciones();
        Scanner input = new Scanner(System.in);

        List<String> trabajadores = new ArrayList<>(Arrays.asList(
            "Juan Pérez",
            "María García",
            "Carlos López",
            "Ana Martínez",
            "Pedro Rodríguez",
            "Laura Hernández",
            "Miguel Sánchez",
            "Isabel Gómez",
            "Francisco Díaz",
            "Elena Fernández"
        ));

        List<Integer> sueldos = new ArrayList<>();

        boolean menu = false;

        while(!menu) {
            System.out.println("1. Asignar Sueldos Aleatorios");
            System.out.println("2. Clasificar sueldos");
            System.out.println("3. Ver estadisticas");
            System.out.println("4. Reporte sueldos");
            System.out.println("5. Salir del programa");
            System.out.print("Ingrese la opcion: ");
            int opc = input.nextInt();

            if (opc == 1) {
                fun.asignarSueldos(sueldos);
            } else if (opc == 2) {
                fun.clasificarSueldos(sueldos, trabajadores);
            } else if (opc == 3) {
                fun.verEstadisticas(sueldos);
            } else if (opc == 4) {
                fun.reporteSueldos(sueldos, trabajadores);
            } else if (opc == 5) {
                menu = true;
            } else {
                System.out.println("Ingrese una opcion valida");
            }
        }
        
        input.close();
    }
}
