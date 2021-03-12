package jdbc;

import java.io.IOException;

public class DAOTeste {
	
	public static void main(String[] args) throws IOException {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) values (?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Pedro Barbosa"));
		System.out.println(dao.incluir(sql, "Joana Joaninha"));
		
		dao.close();
	}

}
