package br.com.zup.modelo;

import java.util.List;

public class Ator extends Pessoa {

	private List<String> filmesParticipados;
	private boolean temOscar;
	private int anoNascimento;
	private String melhorFilme;

	
	public Ator(List<String> filmes, boolean temOscar, int anoNascimento, String nome, String sobrenome, int idade) {

		super(nome, sobrenome, idade);

		this.filmesParticipados = filmes;
		this.temOscar = temOscar;
		this.anoNascimento = anoNascimento;
	}


	public List<String> getFilmesParticipados() {
		return filmesParticipados;
	}

	public void setFilmesParticipados(List<String> filmesParticipados) {
		this.filmesParticipados = filmesParticipados;
	}

	public boolean isTemOscar() {
		return temOscar;
	}

	public void setTemOscar(boolean temOscar) {
		this.temOscar = temOscar;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getMelhorFilme() {
		return melhorFilme;
	}

	public void setMelhorFilme(String melhorFilme) {
		this.melhorFilme = melhorFilme;
	}

	// Método toString
	public String toString() {

		String modelo = "";

		modelo += "Nome -> " + super.getNome() + "\n";
		modelo += "Sobrenome -> " + super.getSobrenome() + "\n";
		modelo += "Idade -> " + super.getIdade() + "\n";
		modelo += "Ano de Nascimento -> " + this.getAnoNascimento() + "\n";
		modelo += "Filmes Participados -> " + this.getFilmesParticipados() + "\n";
		modelo += "Tem Oscar? -> " + this.isTemOscar() + "\n";
		modelo += "Melhor filme -> " + this.melhorFilme + "\n";

		return modelo;
	}

	public String sorteioFilme(int numero, List<String> filmesParticipados) {

		String filme = filmesParticipados.get(numero);

		return filme;
	}
}
