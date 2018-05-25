package br.com.Gerente;

import br.com.Caixa.CaixaBO;
import br.com.Estoque.EstoqueBO;
import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

public class GerenteBO {

    public ProdutoTO adicionaProduto(int id, String nome, String descricao, double valor, String embalagem) {
        ProdutoBO pbo = new ProdutoBO();
        ProdutoTO produto = pbo.adicionaProduto(id, nome, descricao, valor, embalagem);
        return produto;
    }

    public void adicionaEstoque(ProdutoTO p, int qtde) {
        ProdutoBO pbo = new ProdutoBO();
        pbo.adicionaEstoque(p, qtde);
        EstoqueBO.produtosEstoque.add(p);
    }

    public void emiteRelatorioVendas() {
        System.out.println("RELATORIO DE VENDAS:");
        for (int i = 0; i < CaixaBO.relatorioVendas.size(); i++) {
            System.out.println("Vendas do dia: " + CaixaBO.relatorioVendas.get(i).getValor_total());
            System.out.println("Funcionario: "+ CaixaBO.relatorioVendas.get(i).getNome_funcionario());
            System.out.println("---------");
        }
    }

    public void emiteRelatorioEstoque() {
        System.out.println("RELATORIO ESTOQUE: ");
        for (int i = 0; i < EstoqueBO.produtosEstoque.size(); i++) {
            System.out.println("Produto: " + EstoqueBO.produtosEstoque.get(i).getNome());
            System.out.println("Quantidade: " + EstoqueBO.produtosEstoque.get(i).getQuantidade());
            System.out.println("---------");
        }
    }
}
