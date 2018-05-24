package br.com.Gerente;

import br.com.Caixa.CaixaBO;
import br.com.Utils.Utils;
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
    }

    public void emiteRelatorioVendas () {
        System.out.println("RELATORIO DE VENDAS:");
        for (int i = 0; i < CaixaBO.relatorioVendas.size(); i++) {
            System.out.println("ID da venda: " + CaixaBO.relatorioVendas.get(i).getId());
            System.out.println("Cliente: " + CaixaBO.relatorioVendas.get(i).getNome_cliente());
            System.out.println("Data: " + Utils.formataData(CaixaBO.relatorioVendas.get(i).getData()));
            System.out.println("ID produto: " + CaixaBO.relatorioVendas.get(i).getId_produto());
            System.out.println("Quantidade itens: " + CaixaBO.relatorioVendas.get(i).getQtde_itens());
            System.out.println("Valor da venda: " + CaixaBO.relatorioVendas.get(i).getValor_total());
            System.out.println("Vendedor: " + CaixaBO.relatorioVendas.get(i).getNome_funcionario());
            System.out.println("Caixa: " + CaixaBO.relatorioVendas.get(i).getId_caixa());
            System.out.println("---------");
        }
    }
}
