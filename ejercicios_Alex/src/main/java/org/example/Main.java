package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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

        ejercicios ejercicios_inicial = new ejercicios ();
        ejercicios.actividad_inicial();

    }

}
