package Ex05;

import java.util.Scanner;

public class Menu {
    FilaPaciente filaPaciente = new FilaPaciente();
    static Scanner sc = new Scanner(System.in);

    public void menuRecepcao() {
        int op = 0;
        do {
            System.out.println("--------RECEPÇÃO--------");
            System.out.println("\n1. Cadastrar Paciente");
            System.out.println("\n2. Atender Paciente");
            System.out.println("\n3. Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    if (!filaPaciente.isEmpty()) {
                        System.out.println("Paciente atendido: " + atenderPaciente());
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;
            }
        } while (op != 3);
        System.out.println("Atendimento finalizado! Muito obrigado.");
    }

    private void cadastrarPaciente() {
        sc.nextLine();
        System.out.println("Insira o nome do paciente: ");
        filaPaciente.enqueue(sc.nextLine());
        if(!filaPaciente.isFull()) {
            System.out.println("Paciente cadastrado! \n");
        }
    }

    private String atenderPaciente() {
        String nomeAtendido = filaPaciente.dequeue();
        return nomeAtendido;
    }
}
