package br.com.liol.entities;

import java.time.LocalDate;

public class Assinatura {
    private int idAssinatura;
    private LocalDate dataInicio;
    private LocalDate dataVencimento;
    private double valorFinal;
    private Plano plano;
    private String matriculaAluno;

    public int getIdAssinatura() { return idAssinatura; }
    public void setIdAssinatura(int idAssinatura) { this.idAssinatura = idAssinatura; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataVencimento() { return dataVencimento; }
    public void setDataVencimento(LocalDate dataVencimento) { this.dataVencimento = dataVencimento; }

    public double getValorFinal() { return valorFinal; }
    public void setValorFinal(double valorFinal) { this.valorFinal = valorFinal; }

    public Plano getPlano() { return plano; }
    public void setPlano(Plano plano) { this.plano = plano; }

    public String getMatriculaAluno() { return matriculaAluno; }
    public void setMatriculaAluno(String matriculaAluno) { this.matriculaAluno = matriculaAluno; }
}