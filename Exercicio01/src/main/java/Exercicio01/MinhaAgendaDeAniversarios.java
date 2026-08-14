package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios{

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios(ArrayList<Aniversariante> aniversariantes){
        this.aniversariantes = aniversariantes;
    }

    public ArrayList<Aniversariante> getAniversariantes() {
        return aniversariantes;
    }
    public void setAniversariantes(ArrayList<Aniversariante> aniversariantes) {
        this.aniversariantes = aniversariantes;
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome,dia,mes);
        aniversariantes.add(aniversariante);
        System.out.println("Aniversariante adicionado");
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {

        DataAniversario dataBuscada = new DataAniversario(dia,mes);
        ArrayList<String> aniversariantesDoDia = new ArrayList<>();

        for(Aniversariante aniversariante : aniversariantes){
            if(aniversariante.getDataAniversario().equals(dataBuscada)){
                aniversariantesDoDia.add(aniversariante.getNome());
            }
        }
        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for(Aniversariante aniversariante : aniversariantes){
            if(aniversariante.getNome().equals(nomeAniversariante)){
                aniversariantes.remove(aniversariante);
                System.out.println("Aniversariante removido");
                return;
            }
        }
        System.out.println("Aniversariante não encontrado");
    }

    public void listarAniversariantes(ArrayList<Aniversariante> aniversariantes){
        for(Aniversariante aniversariante : aniversariantes){
            System.out.println(aniversariante);
        }
    }
}
