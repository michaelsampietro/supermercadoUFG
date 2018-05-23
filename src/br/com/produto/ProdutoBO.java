package br.com.produto;

public class ProdutoBO {

	public ProdutoTO adicionaProduto(int id, String nome, String descricao, double valor, String embalagem) {
		return new ProdutoTO(id, nome, descricao, valor, embalagem);
	}
	
	public void adicionaEstoque(ProdutoTO p, int qtde) {
		p.setQuantidade(p.getQuantidade() + qtde);
	}
	
	public void removeEstoque(ProdutoTO p, int qtde) {
		p.setQuantidade(p.getQuantidade() - qtde);
	}
	
//	public double consultaPreco(int id) {
//		double preco = 0.0;
//		
//		return preco;
//	}
}