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
        String relCx1 = "";
        String relCx2 = "";
        String relCx3 = "";
        double totalVendasCx1 = 0;
        double totalVendasCx2 = 0;
        double totalVendasCx3 = 0;
        
        for (int i = 0; i < CaixaBO.relatorioVendas.size(); i++) {
        	String cx   ="";
        	String func ="";
        	String vend ="";
        	String div  ="";
        	
        	if (CaixaBO.relatorioVendas.get(i).getId_caixa() == 1) {
        		cx              = "Caixa: " + CaixaBO.relatorioVendas.get(i).getId_caixa() + "\n";
            	func            = "Funcionario: " + CaixaBO.relatorioVendas.get(i).getNome_funcionario() + "\n";;
            	totalVendasCx1 += CaixaBO.relatorioVendas.get(i).getValor_total();
            	vend            = "Vendas do dia: R$ " + totalVendasCx1 + "\n";
            	div             = "---------\n";
            		
        		relCx1 = cx + func + vend + div;
        		
        	} else if (CaixaBO.relatorioVendas.get(i).getId_caixa() == 2){
        		cx              = "Caixa: " + CaixaBO.relatorioVendas.get(i).getId_caixa() + "\n";
            	func            = "Funcionario: " + CaixaBO.relatorioVendas.get(i).getNome_funcionario() + "\n";;
            	totalVendasCx2 += CaixaBO.relatorioVendas.get(i).getValor_total();
            	vend            = "Vendas do dia: R$ " + totalVendasCx2 + "\n";
            	div             = "---------\n";
        		
        		relCx2 = cx + func + vend + div;
        		
        	} else if (CaixaBO.relatorioVendas.get(i).getId_caixa() == 3) {
        		cx              = "Caixa: " + CaixaBO.relatorioVendas.get(i).getId_caixa() + "\n";
            	func            = "Funcionario: " + CaixaBO.relatorioVendas.get(i).getNome_funcionario() + "\n";;
            	totalVendasCx3 += CaixaBO.relatorioVendas.get(i).getValor_total();
            	vend            = "Vendas do dia: R$ " + totalVendasCx3 + "\n";
            	div             = "---------\n";
        		
        		relCx3 = cx + func + vend + div;
        	}
        }
        JOptionPane.showMessageDialog(null, relCx1+relCx2+relCx3, "Relatório de vendas", JOptionPane.INFORMATION_MESSAGE);
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
