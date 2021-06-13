package dao;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

import model.Produto;

//@Named
@ApplicationScoped
public class ProdutoService {

    ArrayList<Produto> produto;

    
    public ProdutoService() {
    	produto = new ArrayList<>();
    	for (int i  = 0; i < 20 ; i++) {
//    		(String id_produto, String nome, double valor, double custo, String descricao)
//    		produto.add(new Produto((1+i)+"", "coca-cola"+(1+i), 5, 3,"refrigerante"));
			
		}

    }

    public List<Produto> getProduto() {
    	
    	return this.produto;
    }

}