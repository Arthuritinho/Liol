package br.com.liol.entities;

public class Plano {

    private int id;
    private String nome;
    private double valor;
    private int desconto;
    private int duracaoDias;
    private String descricao;

    public Plano() {}

    public Plano(String nome, double valor, int desconto, int duracaoDias, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.desconto = desconto;
        this.duracaoDias = duracaoDias;
        this.descricao = descricao;
    }

    public Plano(int id, String nome, double valor, int desconto, int duracaoDias, String descricao) {
        this(nome, valor, desconto, duracaoDias, descricao);
        this.id = id;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public int getDesconto() { return desconto; }
    public void setDesconto(int desconto) { this.desconto = desconto; }

    public int getDuracaoDias() { return duracaoDias; }
    public void setDuracaoDias(int duracaoDias) { this.duracaoDias = duracaoDias; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString() {
        return nome;
    }
}