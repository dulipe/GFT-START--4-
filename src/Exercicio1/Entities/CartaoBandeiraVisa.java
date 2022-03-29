package Exercicio1.Entities;

public class CartaoBandeiraVisa implements PagamentoCartao {

	@Override
	public void pagamentoDebito() {
		System.out.println("Pagamento efetuado com Visa Debito");
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Pagamento efetuado com Visa Credito");
	}

}
