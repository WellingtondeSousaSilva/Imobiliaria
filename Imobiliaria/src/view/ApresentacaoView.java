package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ApresentacaoView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApresentacaoView frame = new ApresentacaoView();
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
	public ApresentacaoView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("O que voc\u00EA deseja fazer?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(102, 91, 302, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioView usuView = new UsuarioView();
				usuView.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(115, 184, 96, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginView logView = new LoginView();
				logView.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(280, 184, 96, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Downloads\\logo_mini2.png"));
		lblNewLabel_1.setBounds(189, 47, 89, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X");
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(457, 11, 20, 33);
		contentPane.add(lblNewLabel_2);
	}
}
