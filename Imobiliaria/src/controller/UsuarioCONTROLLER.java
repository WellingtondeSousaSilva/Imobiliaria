package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import model.UsuarioMODEL;
import view.TelaPrincipalView;



public class UsuarioCONTROLLER {
	Connection conn;
	PreparedStatement pstm;
	
	public void salvarUsuario(UsuarioMODEL objUsuarioModel) {
		
		
		String sql = "INSERT INTO usuario (s_nome_usuario, s_email_usuario, s_senha_usuario) VALUES (?,?,?)";
		
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objUsuarioModel.getNome());
			pstm.setString(2, objUsuarioModel.getEmail());
			pstm.setString(3, objUsuarioModel.getSenha());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
		}
	}
	
	
	public ResultSet autenticarUsuario(UsuarioMODEL objUsuarioModel) {
		conn = new ConexaoCONTROLLER().conectaDB();
		
		try {
		
			String sql = "select * from usuario where s_nome_usuario = ? and s_senha_usuario = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objUsuarioModel.getNome());
			pstm.setString(2, objUsuarioModel.getSenha());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
			
		}
		return null;
		
	}
	
}
		

