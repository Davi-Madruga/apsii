package ingredientes;

public class Calabresa implements Ingrediente{
    private String tipo;

    public Calabresa(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
