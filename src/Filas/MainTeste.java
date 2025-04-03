package Filas;

public class MainTeste {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();
        fila.init();
        fila.enqueue(66);
        //System.out.println("ENQUEUE => ini: " + fila.ini + "fim: " + fila.fim + "cont: " + fila.cont);
        fila.enqueue(17);
        if (!fila.isEmpty()) {
            System.out.println("Valor retirado da fila: " + fila.dequeue());
            //Nesse passo, retiramos um valor da fila e o cont é decrementado (de 2, foi para 1)
        } else {
            System.out.println("A fila está vazia!");
        }

        fila.enqueue(5); //Cont = 2
        fila.enqueue(85); //Cont = 3 (máximo)
        fila.enqueue(77); //Esse valor irá mostrar que a fila está cheia pois o cont == fila.lenght
        //(no caso, 3) - e o cont só pode ir de 0 a 2.
    }
}
