package control;

import java.sql.SQLException;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.*;
import model.*;

import javax.faces.bean.ViewScoped;

@ManagedBean(name = "GarcomBean")
@ViewScoped
public class GarcomBean {

	public String nomeGarcom;
	public String IdGarcom;

	public String getIdGarcom() {
		return IdGarcom;
	}

	public void setIdGarcom(String idGarcom) {
		IdGarcom = idGarcom;
	}

	public String getNomeGarcom() {
		return nomeGarcom;
	}

	public void setNomeGarcom(String nomeGarcom) {
		this.nomeGarcom = nomeGarcom;
	}

	public String GarcomCreate() {
		Conexao conexao = new Conexao();
		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
		Garcom garcom = new Garcom(this.nomeGarcom);
		try {
			garcomDAO.GarcomCreate(garcom);
			return "interfaceMain.jsf?faces-redirect=true";
		} catch (SQLException e) {

			e.printStackTrace();
			return "<script> alert('Garcom não foi criado') </script>";
		}
	}

	public String GarcomUpdate() {
		Conexao conexao = new Conexao();
		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
		Garcom garcom = new Garcom(this.nomeGarcom, this.IdGarcom);
		try {
			garcomDAO.GarcomUpdate(garcom);
			return "interfaceMain.jsf?faces-redirect=true";
		} catch (SQLException e) {

			e.printStackTrace();
			return "<script> alert('Garcom nao editado') </script>";
		}
	}

	public String GarcomSearch() {
		Conexao conexao = new Conexao();
		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
		Garcom garcom = new Garcom(this.nomeGarcom);
		try {
			garcom = garcomDAO.GarcomSearch(garcom);
			System.out.println(garcom.getNome());
			return "interfaceMain.jsf?faces-redirect=true";
		} catch (SQLException e) {

			e.printStackTrace();
			return "<script> alert('Garcom nao encontrado') </script>";
		}
	}

	public String GarcomDelete() {
		Conexao conexao = new Conexao();
		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
		Garcom garcom = new Garcom(this.nomeGarcom, this.IdGarcom);
		try {
			garcomDAO.GarcomDelete(garcom);
			return "interfaceMain.jsf?faces-redirect=true";
		} catch (SQLException e) {

			e.printStackTrace();
			return "<script> alert('Garcom nao deletado') </script>";
		}
	}

}
