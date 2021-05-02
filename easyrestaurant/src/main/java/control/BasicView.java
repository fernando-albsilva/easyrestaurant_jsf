package control;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Conta;
import dao.ContaService;

@SuppressWarnings("serial")
@ManagedBean(name ="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

    private List<Conta> conta;
    private ContaService service;

    
    public BasicView() {
    	this.service = new ContaService();
    	this.conta = service.getConta();
    }
    


 
    public List<Conta> getConta() {
        return this.conta;
    }

  
}
