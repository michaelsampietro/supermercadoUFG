
package br.com.Principal;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.Caixa.CaixaBO;
import br.com.Caixa.CaixaTO;
import br.com.Gerente.GerenteBO;
import br.com.Gerente.GerenteTO;
import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

public class Principal {

	public static void main(String[] args) {
//		Principal p = new Principal();
//		p.iniciaEstoque();
		
		// Cria gerente e funcion�rios
//		Gerente     g1 = new Gerente(01, "Nome Gerente", 99999-9999, "M", "gerente");
//		Funcionario f1 = new Funcionario(01, "Nome Funcionario 1", 99999-9999, "M", "gerente");
		CaixaTO       cx1           = new CaixaTO(01, "caixa 1", "Funcion�rio 1");
//		cx1.setFuncionarioAbertura(f1.getNome());
		
//		GerenteBO     gerenteBO     = new GerenteBO();
//		FuncionarioBO funcionarioBO = new FuncionarioBO();
		CaixaBO       caixaBO       = new CaixaBO();

		// Cadastra produtos
//		ProdutoTO p1 = gerenteBO.adicionaProduto(01, "Bola futebol", "Bola de futebol de campo oficial da copa", 50.0, "UN"); //id e atributos do produto
		
		//teste
		ProdutoBO produtoBO = new ProdutoBO();
		ProdutoTO p1 = produtoBO.adicionaProduto(01, "Bola futebol", "Bola de futebol de campo oficial da copa", 50.0, "UN"); //id e atributos do produto
		//teste

		GerenteBO gerenteBO = new GerenteBO();
		GerenteTO g1 = new GerenteTO(0, "Michael", "999999", "M", "Gerente");

		gerenteBO.adicionaEstoque(p1, 10);
		caixaBO.vendeProduto(cx1.getId(), cx1.getFuncionarioAbertura(), p1, 5, "Cliente 1", new Date());
		
//		gerenteBO.adicionaEstoque(p1, 5);//produtoTO e quantidade adicionada
//		Permitir o pagamento das vendas em dinheiro ou cart�o. Caso seja em dinheiro, o sistema deve informar o valor do troco
		
		// Vende produtos

		caixaBO.vendeProduto(cx1.getId(), cx1.getFuncionarioAbertura(), p1, 10, "Michael", new Date());


		gerenteBO.emiteRelatorioVendas();
		gerenteBO.emiteRelatorioEstoque();
		
		//Consulta pre�o
		JOptionPane.showMessageDialog(null, "Pre�o do produto: " + produtoBO.consultaPreco(p1), 
				"CONSULTA DE PRE�O", JOptionPane.INFORMATION_MESSAGE);
	}
}