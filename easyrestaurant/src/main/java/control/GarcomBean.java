package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import dao.*;
import model.*;

import javax.faces.bean.ViewScoped;



@ManagedBean(name = "GarcomBean")
@ViewScoped
public class GarcomBean {
	
	public String nomeGarcom;
	
	
	
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
			return "template/interfaceMain/interfaceMain.jsf?faces-redirect=true";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "<script> alert('usuario nao autenticado') </script>";
		}
	}

//	public void GarcomSearch() {
//		Conexao conexao = new Conexao();
//		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
//		Garcom garcom = new Garcom(this.nomeGarcom);
//		try {
//			garcomDAO.GarcomCreate(garcom);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void GarcomUpdate() {
//		Conexao conexao = new Conexao();
//		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
//		Garcom garcom = new Garcom(this.nomeGarcom);
//		try {
//			garcomDAO.GarcomCreate(garcom);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public void GarcomDelete() {
//		Conexao conexao = new Conexao();
//		GarcomDAO garcomDAO = new GarcomDAO(conexao.fazerConexao());
//		Garcom garcom = new Garcom(this.nomeGarcom);
//		try {
//			garcomDAO.GarcomCreate(garcom);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
