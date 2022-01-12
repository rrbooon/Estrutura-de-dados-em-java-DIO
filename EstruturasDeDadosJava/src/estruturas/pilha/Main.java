package estruturas.pilha;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        for (int count = 0; count <= 50; count++) {
            minhaPilha.push(new No(count));
        }

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.top());
    }
}
