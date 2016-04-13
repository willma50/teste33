
public class PatrimonioLiquido extends Conta
{
    // Entretanto a depender do tipo da conta, o modo de realizar a operação de crédito ou débito é diferente.
    // De modo oposto, aumentos contábeis nas contas de Passivo e Patrimônio Líquido, implicam em creditação do 
    //valor informado no saldo da conta. De modo complementar, créditos em contas de ativo implicam na diminuição 
    //do saldo da conta e  
    //aumento nas contas de passivo e patrimônio líquido
   
    public  void credito(double valor){
    	this.setSaldo( this.getSaldo() + valor);
    }
    
    
    public  void debitar(double valor){
    
    	this.setSaldo(this.getSaldo() - valor );
    }
}
