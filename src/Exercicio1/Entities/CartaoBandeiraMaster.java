package Exercicio1.Entities;

public class CartaoBandeiraMaster implements PagamentoCartao {

	@Override
	public void pagamentoDebito() {
		System.out.println("Pagamento efetuado com Master Debito");
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Pagamento efetuado com Master Credito");
	}

}
