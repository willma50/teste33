
public class Lancamento
{
    private String descricao;
    private double valor;
    private Conta credito;
    private Conta debito;
    
 
    
    public Lancamento(String descricaoFato, Conta debito,
			Conta credito) {

    	this.setDescricao(descricaoFato);
    	this.setValor(valor);
    	this.setCredito(credito);
    	this.setDebito(debito);
	}

	public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
     public String getDescricao(){
        return this.descricao;
    }
     
     public void setCredito(Conta credito){
    	 
    	 this.credito = credito;
     }
     
     public void setDebito(Conta debito){
    	 this.debito = debito;
     }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
     public double getValor(){
        return this.valor;
    }
}
