package model;

public class Usuario {

	private String id_usuario;
	private String nome;
	private String senha;
	
	public Usuario() {}
	
	public  Usuario(String nome, String senha) {
		setNome(nome);
		setSenha(senha);
	}
	public  Usuario(String id,String nome, String senha) {
		setId_usuario(id);
		setNome(nome);
		setSenha(senha);
	}
	
	public  Usuario(String nome) {
		
		setNome(nome);
		
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
