public class Gerente extends FuncionarioCLT{
    private int tamanhoEquipe;
    private int percentualBonus;
    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao,
                   double valeTransporte, double valeAlimentacao, int tamanhoEquipe, int percentualBonus){
        super(nome,matricula,salarioBase,dataAdmissao,valeTransporte,valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * (1 + (percentualBonus/100));
    }
    @Override
    public double calcularDesconto() {
        if (tamanhoEquipe > 10){
            return super.calcularDesconto() + 100;
        }
        return super.calcularDesconto();
    }

}
