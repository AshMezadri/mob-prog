package ex1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtData;
	private JTextField txtCadastro;

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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCPF.setBounds(37, 32, 46, 14);
		contentPane.add(lblCPF);

		JLabel lblNome = new JLabel("Primeiro nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(37, 64, 89, 14);
		contentPane.add(lblNome);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSobrenome.setBounds(37, 108, 71, 14);
		contentPane.add(lblSobrenome);

		JLabel lblData = new JLabel("Data de Nascimento:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblData.setBounds(37, 155, 123, 14);
		contentPane.add(lblData);

		txtCPF = new JTextField();
		txtCPF.setBounds(170, 30, 170, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(170, 62, 170, 20);
		contentPane.add(txtNome);

		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(170, 106, 170, 20);
		contentPane.add(txtSobrenome);

		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(170, 153, 170, 20);
		contentPane.add(txtData);

		JLabel lblCadastro = new JLabel("Pessoa Cadastrada:");
		lblCadastro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCadastro.setBounds(37, 206, 114, 14);
		contentPane.add(lblCadastro);

		txtCadastro = new JTextField();
		txtCadastro.setEnabled(false);
		txtCadastro.setEditable(false);
		txtCadastro.setBounds(169, 204, 171, 20);
		contentPane.add(txtCadastro);
		txtCadastro.setColumns(10);

		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBounds(162, 243, 89, 23);
		contentPane.add(btnCadastro);

		btnCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Pessoa p = new Pessoa();

				Long cpf = Long.valueOf(txtCPF.getText());
				p.setCpf(cpf);

				String nome = txtNome.getText();
				p.setNome(nome);

				String sobrenome = txtSobrenome.getText();
				p.setSobrenome(sobrenome);

				String data = txtData.getText();
				p.setData(data);

				txtCadastro.setText(p.toString());
			}

		});
	}
}
