package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.UsuarioCONTROLLER;
import model.UsuarioMODEL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UsuarioView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField psSenha;
	private JPasswordField psRepetir;

	UsuarioMODEL objusUarioModel = new UsuarioMODEL();
	UsuarioCONTROLLER objUsuarioController = new UsuarioCONTROLLER();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioView frame = new UsuarioView();
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
	public UsuarioView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(275, 140, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(300, 165, 304, 34);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(300, 235, 304, 34);
		contentPane.add(txtEmail);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(275, 210, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(275, 288, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		psSenha = new JPasswordField();
		psSenha.setBounds(300, 313, 304, 34);
		contentPane.add(psSenha);
		
		psRepetir = new JPasswordField();
		psRepetir.setBounds(300, 383, 304, 39);
		contentPane.add(psRepetir);
		
		JLabel lblNewLabel_3 = new JLabel("Repetir senha:");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(274, 358, 90, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Novo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setBounds(275, 487, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(375, 487, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fechar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_2.setBounds(572, 487, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Salvar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastrar();
			}
		});
		btnNewButton_3.setBackground(new Color(220, 20, 60));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnNewButton_3.setBounds(473, 487, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-62, 0, 315, 538);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\imgdaTeladeCadastro.jpeg"));
		
		JLabel lblNewLabel_5 = new JLabel("Cadastrar-se");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(374, 49, 138, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("   X");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel_6.setBounds(615, 4, 46, 18);
		lblNewLabel_6.setForeground(new Color(220, 20, 60));
		contentPane.add(lblNewLabel_6);
	}
	
	private void cadastrar() {
		
		String nome, email, senha;
		
		nome = txtNome.getText();
		email = txtEmail.getText();
		senha = String.valueOf(psSenha.getPassword());
		
		objusUarioModel = new UsuarioMODEL();
		objusUarioModel.setNome(nome);
		objusUarioModel.setEmail(email);
		objusUarioModel.setSenha(senha);
		
		objUsuarioController.salvarUsuario(objusUarioModel); 
		
		TelaPrincipalView princiView = new TelaPrincipalView();
		
		if(txtNome.getText().equals("") || txtEmail.getText().equals("") || psSenha.getPassword().equals("") || psRepetir.getPassword().equals("")) {
			JOptionPane.showMessageDialog(null, "Campos vazios");
			
		}else {
			princiView.setVisible(true);
			dispose();
		}
		
	}
		

}
	

