package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmes {
	
	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 5.0); // no params deve passar o nome do parâmetro (nota) e o valor do parâmetro (5).
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome()+ " => " + filme.getNota());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	}

}
