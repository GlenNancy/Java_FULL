package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "url";
			final String USER = "User";  
			final String PASS = "Pass";
			con = DriverManager.getConnection(url, USER, PASS);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		} catch (Exception e) {
			System.out.println(e.getMessage() + "Erro no envio dos dados");
		}
		return con;
	}
	
	public static void fecharConexao(Connection con) {
		try {
			
		} catch (Exception e) {
			
		}
	}
}
