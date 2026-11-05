import fabricas.FabricaDeIngredientes;
import pizza.Pizza;
import pizza.PizzaQueijo;
import pizza.PizzaCalabresa;

public class Pizzaria {

    private FabricaDeIngredientes fabrica;

    public Pizzaria(FabricaDeIngredientes fabrica) {
        this.fabrica = fabrica;
    }

    public Pizza pedirPizza(String tipo) {

        Pizza pizza;

        if (tipo.equalsIgnoreCase("queijo")) {
            pizza = new PizzaQueijo(fabrica);

        } else if (tipo.equalsIgnoreCase("calabresa")) {
            pizza = new PizzaCalabresa(fabrica);

        } else {
            throw new IllegalArgumentException("Pizza não encontrada!");
        }

        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();

        return pizza;
    }
}