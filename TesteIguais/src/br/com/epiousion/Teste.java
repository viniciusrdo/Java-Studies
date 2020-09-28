package br.com.epiousion;

public class Teste {

	public static void main(String[] args) {

		
		Pessoa p = new Pessoa();
		Pessoa q = new Pessoa();
		Pessoa r = p;
		
		Pessoa semNada = new Pessoa();
		
		System.out.println(semNada.nome);
		
		p.nome = "Cassemiro Volante";
		q.nome = "Cassemiro Volante";
		
		// comparar endereço
		
		System.out.println(p);
		System.out.println(r);
		
		if(p==r){
			System.out.println("enderecos iguais");
		}
		else{
			System.out.println("diferentes");
		}
		
		// comparar conteudos
		
		if(p.equals(q)){
			System.out.println("\nConteudos Iguais");
		}
		else{
			System.out.println("Conteudos diferentes");
		}
		
	}

}
