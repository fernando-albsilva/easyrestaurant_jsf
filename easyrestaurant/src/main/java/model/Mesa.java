package model;

import java.util.ArrayList;



public class Mesa {

	private String numero;
	private String garcom;
	private String nomeCliente;
	private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	
	public Mesa() {
	}


	public Mesa(String numero, String garcom, String nomeCliente) {
		setNumero(numero);
		// set disponibilidade = 1 ou seja true , então mesa está disponivel set
		// disponibilidade = 0 ouseja false mesa não está disponivel
		setGacom(garcom);
		setNomeCliente(nomeCliente);
	
	}

	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getGarcom() {
		return garcom;
	}

	public void setGacom(String garcom) {
		this.garcom = garcom;
	}
	
	public ArrayList<Produto> getListaProduto() {
		return listaProduto;
	}

	public void setListaProduto(Produto produto) {
		this.listaProduto.add(produto);
	}



	

}
