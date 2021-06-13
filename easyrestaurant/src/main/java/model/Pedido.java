package model;

import java.util.ArrayList;

public class Pedido {

	private String numero_pedido;
	private ArrayList<Produto> lista_produto;
	private String mesa_numero;
	private String id_garcom;
	private String id_usuario;
	
	
	public Pedido (String numero_pedido,String mesa_numero, String id_garcom, String id_usuario) {
		
		setNumero_pedido(numero_pedido);
		setLista_produto();
		setMesa_numero(mesa_numero);
		setId_garcom(id_garcom);
		setId_usuario(id_usuario);
		
	}


	public String getNumero_pedido() {
		return numero_pedido;
	}


	public void setNumero_pedido(String numero_pedido) {
		this.numero_pedido = numero_pedido;
	}


	public ArrayList<Produto> getLista_produto() {
		return lista_produto;
	}


	private void setLista_produto() {
		this.lista_produto = new ArrayList<Produto>();
	}


	public String getMesa_numero() {
		return mesa_numero;
	}


	public void setMesa_numero(String mesa_numero) {
		this.mesa_numero = mesa_numero;
	}


	public String getId_garcom() {
		return id_garcom;
	}


	public void setId_garcom(String id_garcom) {
		this.id_garcom = id_garcom;
	}


	public String getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public double valor_total_pedido() {
		
		double total=0.0;
		
		for (int i=0; i<this.lista_produto.size(); i++) {
			
			total+=this.lista_produto.get(i).getValor();
		}
		
		return total;
		
	}
	 
	public void adiciona_produto(Produto produto) {
		
		this.lista_produto.add(produto);
		
	}

	public void exclui_produto(Produto produto) {
		
		this.lista_produto.remove(produto);
		System.out.println("removeu produto");
	}
	
	public void imprime_pedido() {
		
		
		    for (int i=0; i<this.lista_produto.size(); i++) {
		    	System.out.println("***************************************************************");
		    	System.out.printf("Produto %d : %s\n", i, this.lista_produto.get(i).getNome());
		    	System.out.printf("valor : R$%.2f\n",  this.lista_produto.get(i).getValor());
		    	
		    }
		    
		    System.out.println("***************************************************************");
		    System.out.println("Total de itens do pedido : " + this.lista_produto.size());
		    System.out.println("***************************************************************");
		    System.out.printf("valor total da conta : R$%.2f\n",  this.valor_total_pedido());
	}

	
}
