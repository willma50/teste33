
public class RegistroContabil
{
    private String nomeEmpresa;
    private String CGC;
    private BalancoContabil balancoContabil;
    private LivroLancamento lLancamento;
    
   //O registro contábil deve fornecer uma operações que permita o registro de um fato contábil. Para registro do fato
    //contábil deve-se fornecer a descrição do fato, o nome da conta a ser debitada, o nome da conta a ser creditada e o valor
  
    public RegistroContabil(String nomeEmpresa, String CGC){
    	this.setNomeEmpresa(nomeEmpresa);
    	this.setCGC(CGC);
    	this.balancoContabil = new BalancoContabil();
    	this.lLancamento = new LivroLancamento();
    	
    } 
    public void registrarFatoContabil(String descricaoFato, String nomeContaDebitada, String nomeContaCreditada, double valor){
    	Conta credito = this.balancoContabil.findByName(nomeContaCreditada);
    	Conta debito = this.balancoContabil.findByName(nomeContaDebitada);
    	this.lLancamento.registrarLancamento(descricaoFato, debito, credito, valor);
    	this.balancoContabil.ajustarValor(nomeContaDebitada, nomeContaCreditada, valor);
    	
    }
    
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    
     public String getNomeEmpresa(){
        return this.nomeEmpresa;
    } 
    
    public void setCGC(String CGC){
        this.CGC = CGC;
    }
    
     public String setCGC(){
        return this.CGC;
    } 
    
}
