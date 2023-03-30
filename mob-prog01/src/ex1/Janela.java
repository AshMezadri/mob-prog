package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade;
	private JTextField txtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setTitle("Cálculo de ano de nascimento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(174, 37, 86, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(104, 40, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblNasc = new JLabel("Ano de nascimento:");
		lblNasc.setBounds(55, 96, 95, 14);
		contentPane.add(lblNasc);
		
		txtNasc = new JTextField();
		txtNasc.setEditable(false);
		txtNasc.setColumns(10);
		txtNasc.setBounds(174, 93, 86, 20);
		contentPane.add(txtNasc);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idade = Integer.valueOf(txtIdade.getText());
				
				int ano = 2023-idade;
				
				txtNasc.setText(String.valueOf(ano));
			}
		});
		btnCalcular.setBounds(68, 168, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(234, 168, 89, 23);
		contentPane.add(btnLimpar);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNasc.setText(null);
				txtIdade.setText(null);
			}
		});
	}
}
