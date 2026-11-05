package ingredientes;

public class Calabresa implements Ingrediente{
    public String tipo;

    public Calabresa(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
