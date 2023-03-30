package ex3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Janela3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtModelo;
	private JTextField txtAno;
	private JTextField txtFabricante;
	private JTextField txtCadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela3 frame = new Janela3();
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
	public Janela3() {
		setTitle("Cadastro de Veículo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(168, 226, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 11, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(21, 42, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(21, 76, 46, 14);
		contentPane.add(lblAno);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setBounds(21, 116, 67, 14);
		contentPane.add(lblFabricante);
		
		txtNome = new JTextField();
		txtNome.setBounds(90, 8, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(90, 39, 200, 20);
		contentPane.add(txtModelo);
		
		txtAno = new JTextField();
		txtAno.setBounds(90, 73, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		txtFabricante = new JTextField();
		txtFabricante.setColumns(10);
		txtFabricante.setBounds(90, 113, 200, 20);
		contentPane.add(txtFabricante);
		
		JLabel lblCadastro = new JLabel("Veículo Cadastrado:");
		lblCadastro.setBounds(21, 170, 117, 14);
		contentPane.add(lblCadastro);
		
		txtCadastro = new JTextField();
		txtCadastro.setEditable(false);
		txtCadastro.setEnabled(false);
		txtCadastro.setColumns(10);
		txtCadastro.setBounds(21, 195, 269, 20);
		contentPane.add(txtCadastro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(28, 236, 100, 25);
		contentPane.add(btnCadastrar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String modelo = txtModelo.getText();
				String ano = txtAno.getText();
				String fabricante = txtFabricante.getText();
				
				txtCadastro.setText(nome + "-" + modelo +"-"+ano+"-"+fabricante);
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(173, 236, 100, 25);
		contentPane.add(btnLimpar);
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNome.setText(null);
				txtModelo.setText(null);
				txtAno.setText(null);
				txtFabricante.setText(null);
				txtCadastro.setText(null);
			}
		});
	}

}
