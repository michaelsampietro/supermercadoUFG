package br.com.Caixa;

import br.com.produto.ProdutoTO;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.Pedido.PedidoTO;

public class CaixaBO {
	private double valor_venda = 0.0;
    public static ArrayList<PedidoTO> relatorioVendas = new ArrayList<>();


	//TODO passar eese m�todo pro FuncionarioBO talvez
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
		valor_venda = calculaValorVenda(p, qtde);
		
		String msg = "";
		msg += "Caixa: " + caixa_id + "\n";
		msg += "Vendedor: " + funcionario + "\n";
		msg += "Total: R$" + valor_venda;
		JOptionPane.showMessageDialog(null, msg, "Resumo Venda", JOptionPane.INFORMATION_MESSAGE);

		processaPagamento();
		relatorioVendas.add(ped);
	}
	
	public void processaPagamento() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Escolha a forma de pagamento:"));
		Object[] options = {"Dinheiro", "Cart�o"};
		int fpag = JOptionPane.showOptionDialog(panel, "Forma de pagamento", "FORMA DE PAGAMENTO", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		
		//0 = DINHEIRO
		//1 = CART�O
		if (fpag == 0) {
			String msg = "Total pedido: R$" + this.valor_venda + "\n";
			msg += "Valor em dinheiro:";
			
			double valor_dinheiro = 0;
			while (valor_dinheiro < this.valor_venda) {
				valor_dinheiro = Double.parseDouble(JOptionPane.showInputDialog(msg));
				if (valor_dinheiro < this.valor_venda) {
					JOptionPane.showMessageDialog(null, "Valor insuficiente!", "AVISO", JOptionPane.WARNING_MESSAGE);
				}
			}
			
			double troco = valor_dinheiro - this.valor_venda;			
			JOptionPane.showMessageDialog(null, "Troco: R$" + troco, "TROCO", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public double calculaValorVenda(ProdutoTO p, int qtde) {
		return p.getValor() * qtde;
	}
}