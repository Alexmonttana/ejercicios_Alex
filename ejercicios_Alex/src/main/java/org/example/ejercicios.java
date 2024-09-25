package org.example;

import java.util.Scanner;

public class ejercicios {
    public static void actividad_inicial()
    {

        System.out.println("¿Como te llamas?");

        Scanner entrada = new Scanner(System.in);
        //system.in

        String nombre = entrada.next();

        System.out.println("¿ A que curso vas ?");
        String curso = entrada.next();

        System.out.println("hola + nombre + bienvenido a "+ curso);

        System.out.println("Introduce un numero...");
        int num1 = entrada.nextInt();

        System.out.println("Introduce un numero...");
        int num2 = entrada.nextInt();

        int resultado = num1 + num2;

        System.out.println("el resultado de la suma es" + resultado);

    }
}
