package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DesafioConsultaRegistro {
	
	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite parte do nome: ");
		String parteNome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "SELECT * FROM pessoas where nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + parteNome + "%");
		
		ResultSet resultado = stmt.executeQuery(); 
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
		
	}

}
