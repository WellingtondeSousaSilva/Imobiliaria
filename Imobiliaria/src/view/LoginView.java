package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UsuarioCONTROLLER;
import model.UsuarioMODEL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField psSenha;

	/**
	 * Launch the application.
	 */
	UsuarioMODEL objUsuarioModel = new UsuarioMODEL();
	UsuarioCONTROLLER objUsuarioController = new UsuarioCONTROLLER();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(18, 18, 18));
		panel.setBounds(0, 0, 339, 387);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\imgdateladelogin.jpeg"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Entrar");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(478, 45, 80, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNome.setBounds(374, 118, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(384, 145, 281, 34);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblSenha.setBounds(374, 190, 46, 14);
		contentPane.add(lblSenha);
		
		psSenha = new JPasswordField();
		psSenha.setBounds(384, 228, 281, 34);
		contentPane.add(psSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			logar();
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setBounds(478, 301, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBounds(680, 11, 18, 22);
		contentPane.add(lblNewLabel_2);
	}
	
	private void logar() {
		try {
			String nome, senha;
			
			nome = txtNome.getText();
			senha = String.valueOf(psSenha.getPassword());
			
			objUsuarioModel.setNome(nome);
			objUsuarioModel.setSenha(senha);
			
			objUsuarioController.autenticarUsuario(objUsuarioModel);
			ResultSet rsUsuarioController = objUsuarioController.autenticarUsuario(objUsuarioModel);
			
			if(rsUsuarioController.next()) {
				TelaPrincipalView princiView = new TelaPrincipalView();
				princiView.setVisible(true);
				
				dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos");
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "LoginView" + erro);
		}
		
	}
}
