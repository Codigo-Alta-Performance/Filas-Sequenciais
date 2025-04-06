package Ex05;

public class FilaPaciente {
    static final int N = 5;
    String[] dados = new String[N];
    public int cont, ini, fim;

    public void init() {
        cont = ini = fim = 0;
    }

    public boolean isEmpty() {
        return (cont == 0);
    }

    public boolean isFull() {
        return (cont == N);
    }

    public void enqueue(String nome) {
        if (isFull()) {
            System.out.println("A fila está cheia");
        } else {
            dados[fim] = nome;
            fim = (fim + 1) % N;
            cont++;
        }
    }

    public String dequeue() {
        String nome = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return nome;
    }
}
