package com.evairx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Funcciones {
    public void asignarSueldos(List<Integer> sueldos) {
        Random random = new Random();
        
        for(int i=0;i<10;i++) {
            sueldos.add(random.nextInt(2500000 - 300000 + 1) + 300000);
        }

        System.out.println("Suelados aleatorios asignados correctamente");
    }

    public void clasificarSueldos(List<Integer> sueldos, String[] trabajadores) {
        Scanner input = new Scanner(System.in);

        if (sueldos.size() == 0) {
            System.out.println("no hay sueldos, porfavor asigne los sueldos aleatorio");
            System.out.print("Precione cualquier tecla para continuar...");
            input.nextLine();
            input.close();
        } else {
            int menorValor = 0;
            int medioValor = 0;
            int altoValor = 0;

            List<String> menor = new ArrayList<>();
            List<String> medio = new ArrayList<>();
            List<String> alto = new ArrayList<>();

            int total = 0;

            for(int i=0;i<10;i++) {
                if(sueldos.get(i) < 800000) {
                    menorValor+=1;
                    menor.add(trabajadores[i] + "\t\t$" + sueldos.get(i));
                    total += sueldos.get(i);
                } else if (sueldos.get(i) >= 800000 && sueldos.get(i) <= 2000000) {
                    medioValor+=1;
                    medio.add(trabajadores[i] + "\t\t$" + sueldos.get(i));
                    total += sueldos.get(i);
                } else if (sueldos.get(i) > 2000000) {
                    altoValor+=1;
                    alto.add(trabajadores[i] + "\t\t$" + sueldos.get(i));
                    total += sueldos.get(i);
                }
            }

            System.out.println("Sueldos menores a $800.000 TOTAL:" + menorValor);
            System.out.println();
            System.out.println("Nombre empleado\t\tSueldo");
            
            for(int i=0;i<menor.size();i++) {
                System.out.println(menor.get(i));
            }

            System.out.println();
            System.out.println("Sueldos entre a $800.000 y $2.000.000 TOTAL:" + medioValor);
            System.out.println();
            System.out.println("Nombre empleado\t\tSueldo");

            for(int i=0;i<medio.size();i++) {
                System.out.println(medio.get(i));
            }

            System.out.println();
            System.out.println("Sueldos superiores a $2.000.000 TOTAL:" + altoValor);
            System.out.println();
            System.out.println("Nombre empleado\t\tSueldo");

            for(int i=0;i<alto.size();i++) {
                System.out.println(alto.get(i));
            }

            System.out.println();
            System.out.println("Total Sueldos:" + total);
            System.out.print("Precione cualquier tecla para continuar...");
            input.nextLine();
            input.close();
        }
    }

    public void verEstadisticas(List<Integer> sueldos) {
        Scanner input = new Scanner(System.in);

        if (sueldos.size() == 0) {
            System.out.println("no hay sueldos, porfavor asigne los sueldos aleatorio");
            System.out.print("Precione cualquier tecla para continuar...");
            input.nextLine();
            input.close();
        } else {
            int max = Collections.max(sueldos);
            int min = Collections.min(sueldos);
    
            System.out.println("Sueldo Mas Alto: " + max);
            System.out.println("Sueldo Mas Bajo: " + min);
            System.out.println("Promedio De Sueldos: 0");
            System.out.println("Media Geometrica: ");
        }
    }
}