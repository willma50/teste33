
public abstract class Conta
{
    private String nome;
    private double saldo;
    
    public Conta(){
    
    }
    
    public Conta(String nome){
        this.setNome(nome);
    }
    
    public Conta(String nome, double saldo){
    
    }
      public void setNome(String nome){
        this.nome = nome;
    }
    
     public String getNome(){
        return this.nome;
    }
    
     public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
     public double getSaldo(){
        return this.saldo;
    }
    
    public abstract void credito(double valor);
    public abstract void debitar(double valor);
}
