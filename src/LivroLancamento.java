
public class LivroLancamento
{
    
    private Lancamento[] lancamentos;

	public void registrarLancamento(String descricaoFato, Conta debito, Conta credito, double valor) {
		
		Lancamento lancamento = new Lancamento(descricaoFato, debito, credito);
		this.registrarLancamento(lancamento);
		
	}

	private void registrarLancamento(Lancamento lancamento) {
		Lancamento[] lancamentosNovo = new Lancamento[this.lancamentos.length + 1];
		for(int i=0; i<this.lancamentos.length; i++)
			lancamentosNovo[i] = this.lancamentos[i];
		
		lancamentosNovo[lancamentosNovo.length-1] = lancamento;
		this.lancamentos = lancamentosNovo;		
	}
	
	
    
}
