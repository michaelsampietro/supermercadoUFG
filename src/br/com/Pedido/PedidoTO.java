package br.com.Pedido;

import java.util.Date;

public class PedidoTO {
	
	private int    id;
	private int    id_caixa;
	private int    id_produto;
	private int    qtde_itens;
	private double valor_total;
	private String nome_cliente;
	private Date   data;
	private String nome_funcionario;
	private String forma_pagamento;
	
	public PedidoTO() {
		if (id == 0) {
			id = 1;
		} else {
			id++;	
		}
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
	public int getId_caixa() {
		return id_caixa;
	}
	public void setId_caixa(int id_caixa) {
		this.id_caixa = id_caixa;
	}
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getQtde_itens() {
		return qtde_itens;
	}
	public void setQtde_itens(int qtde_itens) {
		this.qtde_itens = qtde_itens;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome_funcionario() {
		return nome_funcionario;
	}
	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
}
