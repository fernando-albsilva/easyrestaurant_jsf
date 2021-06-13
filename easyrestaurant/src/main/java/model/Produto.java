package model;

public class Produto {

	private String id_produto;
	private String nome;
	private float valor;
	private float custo;

	
	public Produto (String id_produto, String nome, float valor, float custo) {
		
		setId_produto(id_produto);
		setNome(nome);
		setValor(valor);
		setCusto(custo);
		
		
	}
	
		public Produto (String nome, float valor, float custo) {
		
		setNome(nome);
		setValor(valor);
		setCusto(custo);
		
		
	}
		public Produto () {
			
			
			
			
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

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}


	
	
}
