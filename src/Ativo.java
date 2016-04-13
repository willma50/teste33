
public class Ativo extends Conta
{
    //Assim, para operações de aumento contábil de uma conta de Ativo, deve-se debitar essa conta.
   
    public  void credito(double valor){
    	this.setSaldo(this.getSaldo() - valor );
    }
    
    public  void debitar(double valor){
    	this.setSaldo(this.getSaldo() + valor );
    }
}
