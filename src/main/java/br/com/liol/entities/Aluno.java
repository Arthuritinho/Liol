package br.com.liol.entities;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String matriculaAluno;
    private LocalDate dataInscricao;
    private double altura;
    private double peso;
    private String statusMatricula;
    private String objetivo;

    public Aluno() {
        super();
    }

    public String getMatriculaAluno() { return matriculaAluno; }
    public void setMatriculaAluno(String matriculaAluno) { this.matriculaAluno = matriculaAluno; }

    public LocalDate getDataInscricao() { return dataInscricao; }
    public void setDataInscricao(LocalDate dataInscricao) { this.dataInscricao = dataInscricao; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getStatusMatricula() { return statusMatricula; }
    public void setStatusMatricula(String statusMatricula) { this.statusMatricula = statusMatricula; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    @Override
    public String toString() {
        return getNomeCompleto() + " - " + matriculaAluno;
    }
}