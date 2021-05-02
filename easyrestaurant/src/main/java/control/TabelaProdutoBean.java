package control;

import java.io.Serializable;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Produto;
import dao.ProdutoService;


@SuppressWarnings("serial")
@ManagedBean(name ="dtTabelaProduto")
@ViewScoped
public class TabelaProdutoBean implements Serializable {

    private List<Produto> produto;
    private ProdutoService service;

    
    public TabelaProdutoBean() {
    	this.service = new ProdutoService();
    	this.produto = service.getProduto();
    }
    


 
    public List<Produto> getProduto() {
        return this.produto;
    }

  
}
