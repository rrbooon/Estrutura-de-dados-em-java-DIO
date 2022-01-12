package estruturas.ListaEncadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        for (int i = 1; i <= 4; i++){
            minhaListaEncadeada.add(""+i);
        }

        minhaListaEncadeada.remove(3);
        //System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada);
    }

}
