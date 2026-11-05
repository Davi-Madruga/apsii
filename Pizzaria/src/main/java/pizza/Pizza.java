package pizza;

import ingredientes.Calabresa;
import ingredientes.Molho;
import ingredientes.Queijo;

public abstract class Pizza {

    protected String nome;
    protected Queijo queijo;
    protected Molho molho;
    protected Calabresa calabresa;

    public abstract void preparar();

    public void assar() {
        System.out.println("Assando a pizza...");
    }

    public void cortar() {
        System.out.println("Cortando a pizza...");
    }

    public void embalar() {
        System.out.println("Embalando a pizza...");
    }

    public String getNome() {
        return nome;
    }
}