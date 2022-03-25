package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numero;
        int nota;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cúantas notas quieres introducir? ");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            nota = entrada.nextInt();
        }

        entrada.close();
    }
}
