package Exercicio01;

import javax.xml.crypto.Data;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	public Aniversariante(String nome, DataAniversario dataAniversario){
		this.nome = nome;
		this.dataAniversario = dataAniversario;
	}
	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia,mes);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public boolean equals(Aniversariante aniversariante){
		if(aniversariante.getNome().equals(this.getNome())){
			return true;
		}
		return false;
	}


}
