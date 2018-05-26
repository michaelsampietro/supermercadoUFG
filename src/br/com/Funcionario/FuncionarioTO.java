package br.com.Funcionario;

import br.com.Pessoa.PessoaTO;

public class FuncionarioTO extends PessoaTO {

    public FuncionarioTO (int id, String nome, String telefone, String sexo, String cargo) {
        super(id, nome, telefone, sexo, cargo);
    }
}