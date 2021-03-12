package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarCadastro {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o codigo: ");
		int id = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Digite o novo nome: ");
		String novoNome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "UPDATE pessoas set nome = ? where codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.setInt(2, id);
		
		
		stmt.executeUpdate(); 
		System.out.println("Realizado atualização no código " + id + " passando o nome para " + novoNome + ".");

		stmt.close();
		conexao.close();
		entrada.close();
		
	}



}
