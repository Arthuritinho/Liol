package br.com.liol.entities;

public class Plano {

	private String nome;
	private double valor;
	private int desconto;
	private int duracaoDias;
	private String descricao;

	public Plano(
			String nome,
			double valor,
			int desconto,
			int duracaoDias,
			String descricao) {

		this.nome = nome;
		this.valor = valor;
		this.desconto = desconto;
		this.duracaoDias = duracaoDias;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public int getDesconto() {
		return desconto;
	}

	public int getDuracaoDias() {
		return duracaoDias;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return nome;
	}
}
