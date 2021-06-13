package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

import model.Usuario;

//@Named
@ApplicationScoped
public class UsuarioDAO{

	ArrayList<Usuario> usuarioList = new ArrayList<Usuario>() ;
    private Connection conexao;
    
    public UsuarioDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
    
    public Usuario UsuarioSearch() throws  SQLException {
    	
    	String SQL = "SELECT "
				+ " id_usuario, nome, senha"
				+ " FROM usuario";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Usuario usuario =new Usuario();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			String senha = rs.getString(3);
			
			
			usuario.setId_usuario(Integer.toString(id));
			usuario.setNome(nome);
			usuario.setSenha(senha);
			
		}
		
		return usuario;
		
    }
    
    public ArrayList<Usuario> UsuarioListSearch() throws  SQLException {
  	
    	String SQL = "SELECT "
				+ " id_usuario, nome, senha"
				+ " FROM usuario";
		
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
	
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {
			
			Usuario usuario = new Usuario();
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			String senha = rs.getString(3);
			
			usuario.setId_usuario(Integer.toString(id));
			usuario.setNome(nome);
			usuario.setSenha(senha);
			
			this.usuarioList.add(usuario);
			
	}
		for (Usuario produto2 : this.usuarioList) {
			System.out.println(produto2.getId_usuario());
			System.out.println(produto2.getNome());
			System.out.println(produto2.getSenha());
		}
		
		return this.usuarioList;
    }
    
    public void UsuarioCreate(Usuario usuario) throws  SQLException {
    	
    	String SQL = "insert  into usuario (nome,senha) values (?,?)";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, usuario.getNome());
    	ps.setString(2, usuario.getSenha());
    	
		
		ps.execute();
		
		
    }
    
  public void UsuarioUpdate(Usuario usuario) throws  SQLException {
    	
    	String SQL = "update usuario set nome = ?, senha = ? where id_usuario = ? ";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, usuario.getNome());
    	ps.setString(2, usuario.getSenha());
    	ps.setInt(3, Integer.parseInt(usuario.getId_usuario()));
		
    	System.out.println();
		ps.execute();
		
		
    }
  
  public void UsuarioDelete(Usuario usuario) throws  SQLException {
  	
  	String SQL = "Delete from  usuario where id_usuario = ? ";
			
  	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
  	ps.setInt(1, Integer.parseInt(usuario.getId_usuario()));
		
  	System.out.println();
		ps.execute();
		
		
  }
    
}