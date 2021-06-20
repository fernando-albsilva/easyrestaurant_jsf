package control;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import model.*;

@ManagedBean(name = "InterfaceMainBean")
@SessionScoped
public class InterfaceMainBean {

	

	

	public String botaoHome() {

		System.out.println("entrou home");

		return "interfaceMain.jsf?faces-redirect=true";

		// return " ";
		//
	}

	public String botaoProduto() {

		// System.out.println("entrou home");
		System.out.println("entrou produto");

		return "interfaceProdutoMain.jsf?faces-redirect=true";

		// return " ";
		//
	}

	public String botaoGarcom() {

		// System.out.println("entrou home");
		System.out.println("entrou Garcom");

		return "interfaceGarcomMain.jsf?faces-redirect=true";

		// return " ";
		//
	}

	public String botaoUsuario() {

		// System.out.println("entrou home");
		System.out.println("entrou Usuario");

		return "interfaceUsuarioMain.jsf?faces-redirect=true";

		// return " ";
		//
	}

//	public String botaoMesa() {
//
//		// System.out.println("entrou home");
//		System.out.println("entrou Mesa");
//
//		return "interfaceMesaMain.jsf?faces-redirect=true";
//
//		// return " ";
//		//
//	}

	public String botaoReceita() {

		// System.out.println("entrou home");
		System.out.println("entrou Receita");

		return "interfaceReceitaMain.jsf?faces-redirect=true";

		// return " ";
		//
	}

	

}
