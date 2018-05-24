
package br.com.Principal;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.Caixa.CaixaBO;
import br.com.Caixa.CaixaTO;
import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

public class Principal {

	public static void main(String[] args) {
//		Principal p = new Principal();
//		p.iniciaEstoque();
		
		// Cria gerente e funcionários
//		Gerente     g1 = new Gerente(01, "Nome Gerente", 99999-9999, "M", "gerente");
//		Funcionario f1 = new Funcionario(01, "Nome Funcionario 1", 99999-9999, "M", "gerente");
		CaixaTO       cx1           = new CaixaTO(01, "caixa 1", "Funcionário 1");
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
		
//		gerenteBO.adicionaEstoque(p1, 5);//produtoTO e quantidade adicionada
//		Permitir o pagamento das vendas em dinheiro ou cartão. Caso seja em dinheiro, o sistema deve informar o valor do troco
		
		// Vende produtos
		caixaBO.vendeProduto(cx1.getId(), cx1.getFuncionarioAbertura(), p1, 5, "Cliente 1", new Date());
		
		//Consulta preço
		JOptionPane.showMessageDialog(null, "Preço do produto: " + produtoBO.consultaPreco(p1), 
				"CONSULTA DE PREÇO", JOptionPane.INFORMATION_MESSAGE);
	}
}