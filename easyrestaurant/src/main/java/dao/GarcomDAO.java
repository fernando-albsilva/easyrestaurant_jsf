package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

import model.Garcom;

//@Named
@ApplicationScoped
public class GarcomDAO{

    List<Garcom> garcomList;
    private Connection conexao;
    
    public GarcomDAO(Connection _conexao) {
		this.conexao = _conexao;
	}
    
    public Garcom GarcomSearch() throws  SQLException {
    	
    	String SQL = "SELECT "
				+ " idgarcom, nome"
				+ " FROM garcom";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Garcom garcom =new Garcom();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);
			garcom.setId_garcom(Integer.toString(id));
			garcom.setNome(nome);
		
		}
		return garcom;
		
    }
    
    public List<Garcom> GarcomListSearch() throws  SQLException {
    	
    	String SQL = "SELECT "
				+ " idgarcom, nome"
				+ " FROM garcom";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Garcom garcom =new Garcom();
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String nome = rs.getString(2);

			garcom.setId_garcom(Integer.toString(id));
			garcom.setNome(nome);
			
			this.garcomList.add(garcom);
			
		}
		
		return this.garcomList;
     }
    
    public void GarcomCreate(Garcom garcom) throws  SQLException {
    	
    	String SQL = "insert  into garcom (nome) values (?)";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, garcom.getNome());
		
		ps.execute();
		
		
    }
    
  public void GarcomUpdate(Garcom garcom) throws  SQLException {
    	
    	String SQL = "update garcom set nome = ? where idgarcom = ? ";
			
    	PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
    	ps.setString(1, garcom.getNome());
    	ps.setString(2, garcom.getId_garcom());
		
    	System.out.println();
		ps.execute();
		
		
    }
    
}