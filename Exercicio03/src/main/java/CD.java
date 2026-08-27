public class CD extends Produto implements infoGerais{
    public int getNumFaixa() {
        return numFaixa;
    }

    public void setNumFaixa(int numFaixa) {
        this.numFaixa = numFaixa;
    }

    private int numFaixa;

    public CD(String nome, double preco, int numFaixa){
        super(nome,preco);
        this.numFaixa = numFaixa;
    }

    public String exibirInformacoes(){
        return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nNúmero de Faixas: " + this.numFaixa;
    }
}
