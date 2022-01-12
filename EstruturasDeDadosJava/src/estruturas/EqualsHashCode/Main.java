package estruturas.EqualsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> ListaCarros = new ArrayList<>();


        ListaCarros.add(new Carro("Ford"));
        ListaCarros.add(new Carro("Volkswagen"));
        ListaCarros.add(new Carro("Chevrolet"));

        System.out.println(ListaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Renault");
        Carro carro2 = new Carro("Fiat");

        System.out.println(carro1.equals(carro2));

    }
}
