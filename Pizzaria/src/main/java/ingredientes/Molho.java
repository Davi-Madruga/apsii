package ingredientes;

public class Molho implements Ingrediente{
    public String tipo;

    public Molho(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
