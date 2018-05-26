
package br.com.Principal;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.Caixa.CaixaTO;
import br.com.Funcionario.FuncionarioBO;
import br.com.Funcionario.FuncionarioTO;
import br.com.Gerente.GerenteBO;
import br.com.Gerente.GerenteTO;
import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

public class Principal {

	public static void main(String[] args) {		
		// Cria gerente e funcionarios
		GerenteTO     g1  = new GerenteTO(1, "Miguel", "99999-9999", "M", "gerente");
		FuncionarioTO f1  = new FuncionarioTO(1, "Gabriel", "99999-9999", "M", "funcionario");
		FuncionarioTO f2  = new FuncionarioTO(2, "Marcelo", "99999-9999", "M", "funcionario");
		FuncionarioTO f3  = new FuncionarioTO(3, "Henrique", "99999-9999", "M", "funcionario");
		FuncionarioTO f4  = new FuncionarioTO(4, "Felipe", "99999-9999", "M", "funcionario");
		FuncionarioTO f5  = new FuncionarioTO(5, "Thiago", "99999-9999", "M", "funcionario");
		CaixaTO       cx1 = new CaixaTO(1, "Caixa frente", f1.getNome());
		CaixaTO       cx2 = new CaixaTO(2, "Caixa fundo", f2.getNome());
		CaixaTO       cx3 = new CaixaTO(3, "Caixa lateral", f3.getNome());
		
		
		// Instancia as classes BO
		GerenteBO     gerenteBO     = new GerenteBO();
		ProdutoBO     produtoBO     = new ProdutoBO();
		FuncionarioBO funcionarioBO = new FuncionarioBO();

		// Cadastra produtos
		ProdutoTO p1 = gerenteBO.adicionaProduto(01, "Bola futebol", "Bola de futebol de campo oficial da copa", 50.0, "UN"); //id e atributos do produto
		gerenteBO.adicionaEstoque(p1, 20);
		
		ProdutoTO p2 = gerenteBO.adicionaProduto(02, "Chuteira do Neymar", "Chuteira do Neymar Oficial", 420.0, "UN"); //id e atributos do produto
		gerenteBO.adicionaEstoque(p2, 15);
		
		ProdutoTO p3 = gerenteBO.adicionaProduto(02, "Squeeze Copa 2018", "Squeeze de plástico oficial da copa 2018", 40.0, "UN"); //id e atributos do produto
		gerenteBO.adicionaEstoque(p3, 10);
		
		// Início do dia, antes de começar as vendas
		gerenteBO.emiteRelatorioEstoque();
		
		// Vende produtos
		funcionarioBO.vendeProduto(cx1.getId(), cx1.getFuncionarioAbertura(), p1, 5, "Michael", new Date());
		funcionarioBO.vendeProduto(cx2.getId(), cx2.getFuncionarioAbertura(), p2, 1, "Bruno", new Date());
		funcionarioBO.vendeProduto(cx1.getId(), cx1.getFuncionarioAbertura(), p3, 1, "João", new Date());
		funcionarioBO.vendeProduto(cx3.getId(), cx3.getFuncionarioAbertura(), p2, 2, "Lucas", new Date());
		
		// Consulta preço dos produtos
		JOptionPane.showMessageDialog(null, "Preço do produto: " + produtoBO.consultaPreco(p1), 
				"CONSULTA DE PREÇO", JOptionPane.INFORMATION_MESSAGE);
		
		// Emite relatórios de venda e estoque
		gerenteBO.emiteRelatorioVendas();
		gerenteBO.emiteRelatorioEstoque();

	}
}