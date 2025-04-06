package Ex03;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Util {
    private FilaAluno filaAluno = new FilaAluno();

    public void menuPrincipal() {
        filaAluno.init();
        String opcoes = "Escolha uma opção: \n1. Inserir Aluno\n2. Retirar Aluno\n3. Exibir Alunos\n 4. Finalizar";
        int op = 0;
        do {
            op = parseInt(showInputDialog(opcoes));
            if (op < 1 || op > 4) {
                showMessageDialog(null, "Opção inválida!");
            }
            switch (op) {
                case 1:
                    inserirAluno();
                    break;
                case 2:
                    retirarAluno();
                    break;
                case 3:
                    exibirAlunos();
                    break;
            }
        } while (op != 4);
    }

    public void inserirAluno() {
        if (!filaAluno.isFull()) {
            Aluno aluno = new Aluno();
            aluno.setNome(showInputDialog("Insira o nome do aluno"));
            aluno.setRm(parseInt(showInputDialog("Insira o RM do aluno")));
            aluno.setCurso(showInputDialog("Insira o curso do aluno"));
            filaAluno.enqueue(aluno);
        } else {
            showMessageDialog(null, "A fila está cheia!");
        }
    }

    public void retirarAluno() {
        if (filaAluno.isEmpty()) {
            showMessageDialog(null, "A fila está vazia!");
        } else {
            showMessageDialog(null, "RM do aluno retirado: " + filaAluno.dequeue());
        }
    }

    public void exibirAlunos() {
        String aux = "";
        for(int i = filaAluno.ini; i < filaAluno.cont; i++) {
            aux += "\nNome: " + filaAluno.dados[i].getNome();
            aux += "\nRM: " + filaAluno.dados[i].getRm();
            aux += "\nCurso: " + filaAluno.dados[i].getCurso() + "\n";
        }
        showMessageDialog(null, aux);
    }
}
