package Ex04;

import Filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        FilaInt filaProcessos = new FilaInt();
        filaProcessos.init();

        do {
            System.out.println("1. Inserir processo na fila");
            System.out.println("2. Retirar o processo da fila para execução");
            System.out.println("3. Shutdown");
            op = sc.nextInt();

            if (op < 1 || op > 3) {
                System.out.println("Opção inválida!");
            }

            switch (op) {
                case 1:
                    int pid;
                    System.out.println("Insira o pid do processo: ");
                    pid = sc.nextInt();
                    filaProcessos.enqueue(pid);
                    break;
                case 2:
                    if(filaProcessos.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        int resposta;
                        pid = filaProcessos.dequeue();
                        System.out.println("Processo em execução: " + pid);

                        System.out.println("Processo " + pid + " concluiu sua execução?\n1 - SIM");
                        resposta = sc.nextInt();
                        if (resposta == 1) {
                            System.out.println("Processo concluído com sucesso!");
                        } else {
                            filaProcessos.enqueue(pid);
                            System.out.println("O processo retornou para a fila!");
                        }
                    }
                    break;
                case 3:
                    if (!filaProcessos.isEmpty()) {
                        int resposta;
                        System.out.println("Ainda há processos em execução!");

                        System.out.println("Quer encerrá-los?\n1 - SIM");
                        resposta = sc.nextInt();

                        if(resposta == 1) {
                            System.out.println("Tudo bem!");
                            while(!filaProcessos.isEmpty()) {
                                pid = filaProcessos.dequeue();
                                System.out.println("Processo finalizado: pid n° " + pid);
                            }
                        } else {
                            op = 0;
                        }
                    }
            }
        } while (op != 3);
        System.out.println("Shutdown executado com sucesso!");
        sc.close();
    }
}
