package model;

public class Mesa {

	private String numero;
	private int disponibilidade;

	public Mesa(String numero, int disponibilidade)
	{
		setNumero(numero);
		 //set disponibilidade = 1 ou seja true , então mesa está disponivel set disponibilidade = 0 ouseja false mesa não está disponivel
		setDisponibilidade(disponibilidade);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
}
