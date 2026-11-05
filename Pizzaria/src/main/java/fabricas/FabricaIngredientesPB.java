package fabricas;

import ingredientes.Calabresa;
import ingredientes.Molho;
import ingredientes.Queijo;

public class FabricaIngredientesPB implements FabricaDeIngredientes {

    @Override
    public Queijo criarQueijo() {
        return new Queijo("Queijo coalho");
    }

    @Override
    public Molho criarMolho() {
        return new Molho("Molho de tomate caseiro");
    }

    @Override
    public Calabresa criarCalabresa() {
        return new Calabresa("Calabresa artesanal");
    }
}