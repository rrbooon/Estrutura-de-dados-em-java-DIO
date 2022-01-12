package estruturas.ListaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        for (int i = 1; i <= 7; i++){
            minhaListaDuplamenteEncadeada.add("c"+i);

        }

        minhaListaDuplamenteEncadeada.remove(3);

        minhaListaDuplamenteEncadeada.add(3, "indice 3" );

        System.out.println(minhaListaDuplamenteEncadeada);



    }

}
