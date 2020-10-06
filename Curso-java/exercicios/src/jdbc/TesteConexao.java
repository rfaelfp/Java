package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String stringDeConexao = "jdbc:mysql://localhost/sakila?verifyServerCertificate=false&useSSL=true"; // jdbc = java database conection - a ? ap�s o local indica os parametros (desabilitado certificado)
		final String usuario = "root";
		final String senha = "1234";
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		
		System.out.println("Conex�o efetuada com sucesso!");
		conexao.close();
	}

}
