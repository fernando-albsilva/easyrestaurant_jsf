package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;

import model.Garcom;


//@Named
@ApplicationScoped
public class GarcomDAO {

	ArrayList<Garcom> garcomList = new ArrayList<Garcom>();
	private Connection conexao;

	public GarcomDAO(Connection _conexao) {
		this.conexao = _conexao;
	}

	public Garcom GarcomSearch(Garcom garcom) throws SQLException {

		String SQL = "SELECT " + " idgarcom, nome" + " FROM garcom" + " where nome like ? ";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);

		ps.setString(1, "%" + garcom.getNome() + "%");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			int id = rs.getInt(1);
			String nome = rs.getString(2);
			garcom.setId_garcom(Integer.toString(id));
			garcom.setNome(nome);

		}
		return garcom;

	}

	public ArrayList<Garcom> GarcomListSearch() throws SQLException {

		String SQL = "SELECT " + " idgarcom, nome" + " FROM garcom";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			Garcom garcom = new Garcom();
			int id = rs.getInt(1);
			String nome = rs.getString(2);

			garcom.setId_garcom(Integer.toString(id));
			garcom.setNome(nome);

			this.garcomList.add(garcom);

		}

		for (Garcom garcom3 : garcomList) {
			System.out.println(garcom3.getId_garcom());
			System.out.println(garcom3.getNome());
		}

		return this.garcomList;
	}

	public void GarcomCreate(Garcom garcom) throws SQLException {

		String SQL = "insert  into garcom (nome) values (?)";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);

		ps.setString(1, garcom.getNome());

		ps.execute();

	}

	public void GarcomUpdate(Garcom garcom) throws SQLException {

		String SQL = "update garcom set nome = ? where idgarcom = ? ";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);

		ps.setString(1, garcom.getNome());
		ps.setString(2, garcom.getId_garcom());

		System.out.println();
		ps.execute();

	}

	public void GarcomDelete(Garcom garcom) throws SQLException {

		String SQL = "Delete from garcom where idgarcom = ? ";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);

		ps.setInt(1, Integer.parseInt(garcom.getId_garcom()));

		System.out.println();
		ps.execute();

	}

}