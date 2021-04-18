package model;

public class Produto {

	private String id_produto;
	private String nome;
	private double valor;
	private double custo;
	private String descricao;
	
	public Produto (String id_produto, String nome, double valor, double custo, String descricao) {
		
		setId_produto(id_produto);
		setNome(nome);
		setValor(valor);
		setCusto(custo);
		setDescricao(descricao);
		
	}

	public String getId_produto() {
		return id_produto;
	}

	public void setId_produto(String id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
