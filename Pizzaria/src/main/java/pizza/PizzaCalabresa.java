package pizza;

import fabricas.FabricaDeIngredientes;

public class PizzaCalabresa extends Pizza {

    private FabricaDeIngredientes fabrica;

    public PizzaCalabresa(FabricaDeIngredientes fabrica) {
        this.fabrica = fabrica;
        this.nome = "Pizza de Calabresa";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando " + nome);

        queijo = fabrica.criarQueijo();
        molho = fabrica.criarMolho();
        calabresa = fabrica.criarCalabresa();

        System.out.println("Queijo: " + queijo.getTipo());
        System.out.println("Molho: " + molho.getTipo());
        System.out.println("Calabresa: " + calabresa.getTipo());
    }
}