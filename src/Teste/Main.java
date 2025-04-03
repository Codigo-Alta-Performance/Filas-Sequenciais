package Teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de elementas na fila: ");
        int n = sc.nextInt();
        int fim = 0;
        for(int i = 0; i < 10; i++) {
            fim = (fim + 1) % n; //Utilizamos esse resto de divisão para que o valor do fim nunca ultrapasse o limite do vetor
            System.out.println("Fim + 1 " + fim);
            System.out.println("Próximo elemento: " + (i + 1));

        }
    }
}
