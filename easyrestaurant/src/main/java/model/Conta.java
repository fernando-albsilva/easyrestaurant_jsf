package model;

public class Conta {

	private String codigo;
	private String nomeCliente;
	private String nomeGarcom;
	private double valor;

	public Conta(String codigo, String nomeCliente, String nomeGarcom, double valor) {
		
		this.codigo = codigo;
		this.nomeCliente = nomeCliente;
		this.nomeGarcom = nomeGarcom;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNomeGarcom() {
		return nomeGarcom;
	}
	public void setNomeGarcom(String nomeGarcom) {
		this.nomeGarcom = nomeGarcom;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	
}
