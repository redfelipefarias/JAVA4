package VETORES;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int vetor[] = new int[4];

        for (int i = 0; i < 4; i++) {
            vetor[i] = l.nextInt();
        }

        int soma = 0;
        for (int contador = 0; contador < vetor.length; contador++){
            soma = soma + vetor[contador];
        }
        System.out.println(soma);
    }
}
