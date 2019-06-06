package br.com.zup.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.zup.modelo.Ator;
import br.com.zup.modelo.Programador;

public class TestePessoa {

	public static void main(String[] args) {

		List<String> linguagens = new ArrayList<>(Arrays.asList("Java", "Ruby", "PHP"));
		List<String> filmes = new ArrayList<String>(
				Arrays.asList("A fantastica fabrica de chocolate", "A noiva Cadaver", "Alice no país das maravilhas"));

		Random random = new Random();

		Programador programador = new Programador(linguagens, 1, true, "Gessica", "Sousa", 18);
		Ator ator = new Ator(filmes, true, 1963, " Johnny ", "Deep", 56);

		int numero = random.nextInt(ator.getFilmesParticipados().size());

		ator.setMelhorFilme(ator.sorteioFilme(numero, ator.getFilmesParticipados()));

		System.out.println(programador);
		System.out.println(ator);
	}

}
