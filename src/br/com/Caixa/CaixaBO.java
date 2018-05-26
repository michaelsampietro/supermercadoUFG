package br.com.Caixa;

import br.com.produto.ProdutoTO;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.Pedido.PedidoTO;

public class CaixaBO {
//    private double valor_venda = 0.0;
    public static ArrayList<PedidoTO> relatorioVendas = new ArrayList<>();

    public void processaPagamento(double valor_venda) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Escolha a forma de pagamento:"));
        Object[] options = {"Dinheiro", "Cartão"};
        int fpag = JOptionPane.showOptionDialog(panel, "Forma de pagamento", "FORMA DE PAGAMENTO",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);

        //0 = DINHEIRO
        //1 = CARTAO
        if (fpag == 0) {
            String msg = "Total pedido: R$" + valor_venda + "\n";
            msg += "Valor em dinheiro:";

            double valor_dinheiro = 0;
            while (valor_dinheiro < valor_venda) {
                valor_dinheiro = Double.parseDouble(JOptionPane.showInputDialog(msg));
                if (valor_dinheiro < valor_venda) {
                    JOptionPane.showMessageDialog(null, "Valor insuficiente!", "AVISO", JOptionPane.WARNING_MESSAGE);
                }
            }

            double troco = valor_dinheiro - valor_venda;
            JOptionPane.showMessageDialog(null, "Troco: R$" + troco, "TROCO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public double calculaValorVenda(ProdutoTO p, int qtde) {
        return p.getValor() * qtde;
    }
}