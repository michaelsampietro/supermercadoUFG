package br.com.Caixa;

import br.com.produto.ProdutoTO;
import java.util.Date;
import javax.swing.JOptionPane;
import br.com.Pedido.PedidoTO;

public class CaixaBO {
	
	
	//TODO passar eese método pro FuncionarioBO
	public void vendeProduto(int caixa_id, String funcionario, ProdutoTO p, int qtde, String cliente, Date data) {
		PedidoTO ped = new PedidoTO();
		ped.setId_caixa(caixa_id);
		ped.setNome_funcionario(funcionario);
		ped.setId_produto(p.getId());
		ped.setQtde_itens(qtde);
		ped.setNome_cliente(cliente);
		ped.setData(data);
		ped.setValor_total(calculaValorVenda(p, qtde));
		
		p.setQuantidade(p.getQuantidade() - qtde); //atualiza quantidade em estoque
		
		String msg = "";
		msg += "Caixa: " + caixa_id + "\n";
		msg += "Vendedor: " + funcionario + "\n";
		msg += "Total: " + calculaValorVenda(p, qtde);
		JOptionPane.showMessageDialog(null, msg, "Resumo Venda", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public double calculaValorVenda(ProdutoTO p, int qtde) {
		return p.getValor() * qtde;
	}
}