package estruturas.fila;

public class Main {
    public static void main(String[] args) {
        Fila<String>minhaFila = new Fila<>();

        for (int count = 0; count <= 4; count++) {
            minhaFila.enqueue(""+count);
        }

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}
