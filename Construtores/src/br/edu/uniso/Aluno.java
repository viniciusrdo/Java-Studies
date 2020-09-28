package br.edu.uniso;

public class Aluno {

	public Aluno() {
		contador = contador + 1;
	}
	
	private static int contador;
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	private String nome;
	private int idade;
	
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
		this.idade = idade;
	}
	
	
	
}