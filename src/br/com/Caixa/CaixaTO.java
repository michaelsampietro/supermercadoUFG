package br.com.Caixa;

public class CaixaTO {
	private int    id;
	private String descricao;
	private String funcionario_abertura;
	
	public CaixaTO(int id, String descricao, String funcionario_abertura) {
		this.id = id;
		this.descricao = descricao;
		this.funcionario_abertura = funcionario_abertura;
	}

	
	/*
	 * GETTERS AND SETTERS
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFuncionarioAbertura() {
		return funcionario_abertura;
	}
	public void setFuncionarioAbertura(String funcionario_abertura) {
		this.funcionario_abertura = funcionario_abertura;
	}
}