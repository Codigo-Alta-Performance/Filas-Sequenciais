package Ex03;
import static javax.swing.JOptionPane.*;

public class FilaAluno {
    static final int N = 4;
    public Aluno[] dados = new Aluno[N];
    int ini, fim, cont;

    public void init() {
        ini = 0;
        fim = 0;
        cont = 0;
    }

    public boolean isFull() {
        return (cont == N);
    }

    public boolean isEmpty() {
        return (cont == 0);
    }

    public void enqueue(Aluno aluno) {
        if (isFull()) {
            showMessageDialog(null, "A fila está cheia!");
        } else {
            dados[fim] = aluno;
            fim = (fim + 1) % N;
            cont++;
        }
    }

    public int dequeue(){
        int rm = dados[ini].getRm();
        ini = (ini + 1) % N;
        cont--;
        return rm;
    }
}
