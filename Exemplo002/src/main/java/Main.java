public class Main {
    public static void main(String[] args){
        Veiculo c = new Carro();
        Veiculo b = new Bicicleta();
        Pista p = new Pista();

        System.out.println(p.iniciarCorrida(c));
        System.out.println(p.iniciarCorrida(b));
    }
}
