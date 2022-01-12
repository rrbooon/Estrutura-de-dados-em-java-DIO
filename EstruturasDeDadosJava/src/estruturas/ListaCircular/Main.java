package estruturas.ListaCircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        for (int i = 0; i<=10; i++){
            minhaListaCircular.add("item "+i);
        }

        minhaListaCircular.remove(2);
        System.out.println(minhaListaCircular);
    }
}
