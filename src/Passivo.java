
public class Passivo extends Conta
{
   
    public  void credito(double valor){
    	this.setSaldo( this.getSaldo() + valor);
    }
    
    public  void debitar(double valor){
    
    	this.setSaldo(this.getSaldo() - valor );
    }
}
