package fabricas;

import ingredientes.Calabresa;
import ingredientes.Molho;
import ingredientes.Queijo;

public interface FabricaDeIngredientes {

    Queijo criarQueijo();

    Molho criarMolho();

    Calabresa criarCalabresa();
}