import fabricas.FabricaIngredientesPB;
import fabricas.FabricaIngredientesRN;

public class Main {

    public static void main(String[] args) {

        Pizzaria pizzariaPB = new Pizzaria(
                new FabricaIngredientesPB()
        );

        Pizzaria pizzariaRN = new Pizzaria(
                new FabricaIngredientesRN()
        );

        System.out.println("=== PIZZARIA PARAÍBA ===");
        pizzariaPB.pedirPizza("queijo");

        System.out.println();

        System.out.println("=== PIZZARIA RIO GRANDE DO NORTE ===");
        pizzariaRN.pedirPizza("calabresa");
    }
}