package Filas;

public class FilaInt {
    public final int N = 3;
    int[] dados = new int [N];
    public int ini, fim, cont;

    public void init() {
        ini = 0;
        fim = 0;
        cont = 0;
    }

    public boolean isEmpty() {
        return (cont == 0);
    }

    public boolean isFull() {
        return (cont == N);
    }

    public void enqueue(int valor) {
        if (isFull()) {
            System.out.println("A fila está cheia!");
        } else {
            dados[fim] = valor;
            fim = (fim + 1) % N; //Utilizamos esse resto de divisão para que o valor do fim nunca ultrapasse o valor máximo
            //do vetor
            //fim 1 % 3 = 1    |
            //fim 2 % 3 = 2    | => Dessa maneira, sempre que o contador ini for chegar em 3, ele volta para o 0
            //fim 3 % 3 = 0    |    ATÉ O MOMENTO QUE O CONT FOR IGUAL AO NÚMERO MÁXIMO DO VETOR
            //RESUMINDO: O cont irá deifnir quando a fila estiver cheia ou vazia, enquanto essa operação com resto de divisão
            //irá garantir que enquanto a fila não estiver cheia o valor do fim e do ini retornem para o 0 quando o valor máximo
            //do vetor for atingido por eles
            cont++;
        }
    }

    public int dequeue() {
        int v = dados[ini];
        ini = (ini + 1) % N;
        cont--;
        return v;
    }

}
