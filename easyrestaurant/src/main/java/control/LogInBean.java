package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "LogInBean")
@ViewScoped
public class LogInBean {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String autentica() {
		if( this.userName.equals("fernando") && this.password.equals("200790"))
		{
			
			System.out.println("auntenticado");
			System.out.println(this.userName);
			System.out.println(this.password);
//			return "template/interfaceMain/interfaceMain.jsf";
			
			return "template/interfaceMain/interfaceMain.jsf?faces-redirect=true";
			
		}else {
			System.out.println("nao autenticado");
			System.out.println(this.userName);
			System.out.println(this.password);
//			return "usuario incorreto";
			
			return "<script> alert('usuario nao autenticado') </script>";
		}
//		System.out.println("autenticou");
//		System.out.println(this.userName);
//		System.out.println(this.password);
//     	return "template/interfaceMain/interfaceMain.jsf";
	}
}
