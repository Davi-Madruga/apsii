package fabricas;

import ingredientes.Calabresa;
import ingredientes.Molho;
import ingredientes.Queijo;

public class FabricaIngredientesRN implements FabricaDeIngredientes {

    @Override
    public Queijo criarQueijo() {
        return new Queijo("Queijo mussarela");
    }

    @Override
    public Molho criarMolho() {
        return new Molho("Molho de tomate temperado");
    }

    @Override
    public Calabresa criarCalabresa() {
        return new Calabresa("Calabresa defumada");
    }
}