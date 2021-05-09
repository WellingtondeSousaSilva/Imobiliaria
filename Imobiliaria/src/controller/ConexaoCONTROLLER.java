package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoCONTROLLER {
	public Connection conectaDB() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/imobiliaria?user=root&password=";
			conn = DriverManager.getConnection(url);
			
		} catch (SQLException erro) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
		}
		
		return conn;
	}
}
