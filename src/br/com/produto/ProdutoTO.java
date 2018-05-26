package br.com.produto;

public class ProdutoTO {
	
	private int    id;
	private String nome;
	private String descricao;
	private double valor;
	private int    quantidade;
	private String embalagem; //UN - unidade ou KG - quilo
	
	public ProdutoTO(int id, String nome, String descricao, double valor, String embalagem) {
		this.id        = id;
		this.nome      = nome;
		this.descricao = descricao;
		this.valor     = valor;
		this.embalagem = embalagem;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getEmbalagem() {
		return embalagem;
	}
	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}
}
