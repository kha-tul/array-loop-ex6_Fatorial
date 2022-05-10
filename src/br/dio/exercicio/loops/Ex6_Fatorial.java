package br.dio.exercicio.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; // multiplicacao precisa começar com 1.
        // Se fosse igual a zero, toda multiplicacao seria = 0.

        System.out.println(fatorial + "! = ");

       // quando precisar contador, utilize o 'for'.
        // variável 'int i = fatorial' é o ínicio, ou seja, igual a zero. o 'i >= 1', seria o controle. até
        // quando o laço deve ser repetido. Ou seja, quando o fatorial (i) for igual a '1'.
        // E a parte final, é quando o loop parar, ou seja, precisa diminuir o valor.

        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i; // é o número que está mudando.

        }

        System.out.println(multiplicacao);

    }
}
