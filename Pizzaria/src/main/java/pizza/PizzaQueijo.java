package pizza;

import fabricas.FabricaDeIngredientes;

public class PizzaQueijo extends Pizza {

    private FabricaDeIngredientes fabrica;

    public PizzaQueijo(FabricaDeIngredientes fabrica) {
        this.fabrica = fabrica;
        this.nome = "Pizza de Queijo";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nome);

        queijo = fabrica.criarQueijo();
        molho = fabrica.criarMolho();

        System.out.println("Queijo: " + queijo.getTipo());
        System.out.println("Molho: " + molho.getTipo());
    }
}