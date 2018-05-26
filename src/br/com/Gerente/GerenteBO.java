package br.com.Gerente;

import br.com.Caixa.CaixaBO;
import br.com.Estoque.EstoqueTO;
import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

import javax.swing.*;

public class GerenteBO {

    public ProdutoTO adicionaProduto(int id, String nome, String descricao, double valor, String embalagem) {
        ProdutoBO pbo = new ProdutoBO();
        ProdutoTO produto = pbo.adicionaProduto(id, nome, descricao, valor, embalagem);
        return produto;
    }

    public void adicionaEstoque(ProdutoTO p, int qtde) {
        ProdutoBO pbo = new ProdutoBO();
        pbo.adicionaEstoque(p, qtde);
        EstoqueTO.produtosEstoque.add(p);
    }

    public void emiteRelatorioVendas() {
        String msg = "";
        for (int i = 0; i < CaixaBO.relatorioVendas.size(); i++) {
            msg += "Vendas do dia: " + CaixaBO.relatorioVendas.get(i).getValor_total() + "\n";
            msg += "Funcionario: " + CaixaBO.relatorioVendas.get(i).getNome_funcionario() + "\n";;
            msg += "---------\n";
        }
        JOptionPane.showMessageDialog(null, msg, "Relatório de vendas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void emiteRelatorioEstoque() {
        String msg = "";
        for (int i = 0; i < EstoqueTO.produtosEstoque.size(); i++) {
            msg += "Produto: " + EstoqueTO.produtosEstoque.get(i).getNome() + "\n";
            msg += "Quantidade: " + EstoqueTO.produtosEstoque.get(i).getQuantidade() + "\n";
            msg += "---------\n";
        }
        JOptionPane.showMessageDialog(null, msg, "Relatório de estoque", JOptionPane.INFORMATION_MESSAGE);
    }
}
