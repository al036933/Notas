package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cúantas notas quieres introducir? ");
        numero = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero);
        }
    }
}
