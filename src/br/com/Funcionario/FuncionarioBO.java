package br.com.Funcionario;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.Caixa.CaixaBO;
import br.com.Pedido.PedidoTO;
import br.com.produto.ProdutoTO;

public class FuncionarioBO {
	private double valor_venda = 0.0;
	
    
    public void vendeProduto(int caixa_id, String funcionario, ProdutoTO p, int qtde, String cliente, Date data) {
    	CaixaBO caixaBO = new CaixaBO();
    	
        if (qtde > p.getQuantidade()) {
            JOptionPane.showMessageDialog(null, "Não há produtos suficientes em estoque!", "Resumo Venda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            PedidoTO ped = new PedidoTO();
            ped.setId_caixa(caixa_id);
            ped.setNome_funcionario(funcionario);
            ped.setId_produto(p.getId());
            ped.setQtde_itens(qtde);
            ped.setNome_cliente(cliente);
            ped.setData(data);
            ped.setValor_total(caixaBO.calculaValorVenda(p, qtde));

            p.setQuantidade(p.getQuantidade() - qtde); //atualiza quantidade em estoque
            valor_venda = caixaBO.calculaValorVenda(p, qtde);

            String msg = "";
            msg += "Caixa: " + caixa_id + "\n";
            msg += "Vendedor: " + funcionario + "\n";
            msg += "Total: R$" + valor_venda;
            JOptionPane.showMessageDialog(null, msg, "Resumo Venda", JOptionPane.INFORMATION_MESSAGE);

            caixaBO.processaPagamento(valor_venda);
            CaixaBO.relatorioVendas.add(ped);
        }
    }

}