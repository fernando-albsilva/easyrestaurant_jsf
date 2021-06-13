package model;

public class Garcom {

	private String id_garcom;
	private String nome;
	
	public Garcom () {}
	
	public Garcom (String nome) {
	 this.setNome(nome);
	}

	public String getId_garcom() {
		return id_garcom;
	}

	public void setId_garcom(String id_garcom) {
		this.id_garcom = id_garcom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
