package br.com.Funcionario;

import br.com.produto.ProdutoBO;
import br.com.produto.ProdutoTO;

public class FuncionarioBO {


    public void vendeProduto (ProdutoTO p, int qtde) {
        ProdutoBO pbo = new ProdutoBO();
        pbo.removeEstoque(p, qtde);
    }

}
