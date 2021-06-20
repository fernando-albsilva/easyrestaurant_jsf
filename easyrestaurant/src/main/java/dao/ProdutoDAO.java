package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;

import model.Produto;

//@Named
@ApplicationScoped
public class ProdutoDAO{

	ArrayList<Produto> produtoList = new ArrayList<Produto>() ;
    private Connection conexao;
    
    public ProdutoDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
    
    public Produto ProdutoSearch(Produto produto) throws  SQLException {
    	
    	String SQL = "SELECT id_produto, nome, valor, custo FROM produto where nome like ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, "%" + produto.getNome() + "%");
		
		ResultSet rs = ps.executeQuery();
		
				
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			float valor = rs.getFloat(3);
			float custo = rs.getFloat(4);
			
			produto.setId_produto(Integer.toString(id));
			produto.setNome(nome);
			produto.setValor(valor);
			produto.setCusto(custo);
		}
		
		return produto;
		
    }
    
    public ArrayList<Produto> ProdutoListSearch() throws  SQLException {
  	
    	String SQL = "SELECT "
				+ " id_produto, nome, valor, custo"
				+ " FROM produto";
		
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
	
		ResultSet rs = ps.executeQuery();
		
		
		while(rs.next()) {
			
			Produto produto =new Produto();
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			float valor = rs.getFloat(3);
			float custo = rs.getFloat(4);
			
			produto.setId_produto(Integer.toString(id));
			produto.setNome(nome);
			produto.setValor(valor);
			produto.setCusto(custo);
			this.produtoList.add(produto);
			
	}
		for (Produto produto2 : this.produtoList) {
			System.out.println(produto2.getId_produto());
			System.out.println(produto2.getNome());
			System.out.println(produto2.getValor());
			System.out.println(produto2.getCusto());
		}
		
		return this.produtoList;
    }
    
    public void ProdutoCreate(Produto produto) throws  SQLException {
    	
    	String SQL = "insert  into produto (nome,valor,custo) values (?,?,?)";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, produto.getNome());
    	ps.setFloat(2, produto.getValor());
    	ps.setFloat(3, produto.getCusto());
		
		ps.execute();
		
		
    }
    
  public void ProdutoUpdate(Produto produto) throws  SQLException {
    	
    	String SQL = "update produto set nome = ?, valor = ?, custo = ? where id_produto = ? ";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, produto.getNome());
    	ps.setFloat(2, produto.getValor());
    	ps.setFloat(3, produto.getCusto());
    	ps.setInt(4, Integer.parseInt(produto.getId_produto()));
		
    	System.out.println();
		ps.execute();
		
		
    }
  
  public void ProdutoDelete(Produto produto) throws  SQLException {
  	
  	String SQL = "Delete from  produto where id_produto = ? ";
			
  	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
  	ps.setInt(1, Integer.parseInt(produto.getId_produto()));
		
  	System.out.println();
		ps.execute();
		
		
  }
    
}