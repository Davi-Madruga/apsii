package ingredientes;

public class Queijo implements Ingrediente{
    public String tipo;

    public Queijo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String getTipo() {
        return tipo;
    }
}
