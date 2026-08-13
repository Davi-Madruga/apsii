package Exercicio01;

public class Main {
    public static void main(String[] args){
        Aniversariante a1 = new Aniversariante("Pedro",1,2);
        Aniversariante a2 = new Aniversariante("Pedro",1,2);
        System.out.println(a1);
        System.out.println(a1.getNome());
        System.out.println(a1.getDataAniversario());
        System.out.println(a2);
        System.out.println(a2.getNome());
        System.out.println(a2.getDataAniversario());
        System.out.println(a1.equals(a2));
    }
}
