package Exercicio01;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        DataAniversario data = new DataAniversario(20,03);
        ArrayList<Aniversariante> aniversariantes = new ArrayList<>();

        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios(aniversariantes);

        agenda.adicionarAniversariante("Davi",1,2);
        agenda.adicionarAniversariante("Ana",1,2);
        agenda.listarAniversariantes(agenda.getAniversariantes());
        agenda.adicionarAniversariante("Arthur",43,2);
        agenda.removerAniversariante("Ana");
        agenda.listarAniversariantes(agenda.getAniversariantes());
        System.out.println(agenda.obterAniversariantesDoDia(1,2));
    }
}
