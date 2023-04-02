package ex2;

import java.util.Date;

public class Pessoa {

	public Long cpf;
	public String nome;
	public String sobrenome;
	public String data;
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome +" "+ this.sobrenome +" - "+ this.cpf + " - "+ this.data;
	}
	
	
}
