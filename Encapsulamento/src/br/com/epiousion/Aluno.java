package br.com.epiousion;

public class Aluno {
	
	String nome;
	int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade < 18){
			System.out.println("Maneh, nao pode cadastrar! ");
			System.exit(-1);
		}
		else{
			this.idade = idade;
		}
	}
	
}
