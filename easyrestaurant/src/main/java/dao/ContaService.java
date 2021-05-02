package dao;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

import model.Conta;

//@Named
@ApplicationScoped
public class ContaService {

    List<Conta> conta;

    
    public ContaService() {
    	conta = new ArrayList<>();
    	for (int i  = 0; i < 20 ; i++) {
    		
    		conta.add(new Conta((1+i)+"", "Fabio"+(1+i), "João"+(1+i), i*15));
			
		}

    }

    public List<Conta> getConta() {
    	
    	return this.conta;
    }

}