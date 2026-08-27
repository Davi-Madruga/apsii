import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do livro: ");
        String nomeLivro = sc.nextLine();
        System.out.println("Preço do livro: ");
        double precoLivro = sc.nextDouble();
        sc.next();
        System.out.println("Autor do livro: ");
        String autor = sc.nextLine();
        Livro livro = new Livro(nomeLivro,precoLivro,autor);

        System.out.println("Nome do CD: ");
        String nomeCD = sc.nextLine();
        System.out.println("Preço do CD: ");
        double precoCD = sc.nextDouble();
        sc.next();
        System.out.println("Numero de faixas: ");
        int numFaixas = sc.nextInt();
        CD cd = new CD(nomeCD,precoCD,numFaixas);

        System.out.println(cd.exibirInformacoes());
    }
}
