package ex2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtCampo1;
	private JTextField txtCampo2;
	private JTextField txtCampo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela2 frame = new Janela2();
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
	public Janela2() {
		setTitle("Gerador de senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 226);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(49, 53, 46, 14);
		contentPane.add(lblSenha);
		
		txtCampo1 = new JTextField();
		txtCampo1.setEnabled(false);
		txtCampo1.setEditable(false);
		txtCampo1.setBounds(105, 50, 30, 20);
		contentPane.add(txtCampo1);
		txtCampo1.setColumns(10);
		
		txtCampo2 = new JTextField();
		txtCampo2.setEnabled(false);
		txtCampo2.setEditable(false);
		txtCampo2.setColumns(10);
		txtCampo2.setBounds(157, 50, 30, 20);
		contentPane.add(txtCampo2);
		
		txtCampo3 = new JTextField();
		txtCampo3.setEnabled(false);
		txtCampo3.setEditable(false);
		txtCampo3.setColumns(10);
		txtCampo3.setBounds(203, 50, 30, 20);
		contentPane.add(txtCampo3);
		
		JButton btnGerar = new JButton("Gerar próxima senha");
		btnGerar.setBounds(68, 113, 151, 23);
		contentPane.add(btnGerar);
		
		btnGerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int campoUm =(int) Math.floor( Math.random()*10);
				int campoDois =  (int) Math.floor( Math.random()*10);
				int campoTres = (int) Math.floor( Math.random()*10);

				txtCampo1.setText(String.valueOf(campoUm));
				txtCampo2.setText(String.valueOf(campoDois));
				txtCampo3.setText(String.valueOf(campoTres));


			}
		});	
		
	}

}
