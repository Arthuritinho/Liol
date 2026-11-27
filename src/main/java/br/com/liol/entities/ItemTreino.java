package br.com.liol.entities;

public class ItemTreino {
    private Exercicio exercicio;
    private int series;
    private int repeticoes;
    private int ordemExecucao;

    public ItemTreino() {}

    public ItemTreino(Exercicio exercicio, int series, int repeticoes, int ordemExecucao) {
        this.exercicio = exercicio;
        this.series = series;
        this.repeticoes = repeticoes;
        this.ordemExecucao = ordemExecucao;
    }

    public Exercicio getExercicio() { return exercicio; }
    public void setExercicio(Exercicio exercicio) { this.exercicio = exercicio; }

    public int getSeries() { return series; }
    public void setSeries(int series) { this.series = series; }

    public int getRepeticoes() { return repeticoes; }
    public void setRepeticoes(int repeticoes) { this.repeticoes = repeticoes; }

    public int getOrdemExecucao() { return ordemExecucao; }
    public void setOrdemExecucao(int ordemExecucao) { this.ordemExecucao = ordemExecucao; }
}