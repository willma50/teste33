
public class BalancoContabil
{
    
	private Conta[] contas;

	 public Conta findByName(String nome){
	        for(Conta conta : this.contas)
	          if(conta.getNome().equals(nome))
	            return conta;
	        return null;    
	    }

	public void ajustarValor(String nomeContaDebitada, String nomeContaCreditada, double valor) {
		
		Conta credito = this.findByName(nomeContaCreditada);
		Conta debito = this.findByName(nomeContaDebitada);
		credito.setSaldo(valor);
		debito.setSaldo(valor);
		
		
	} 
	
	 
	
}
