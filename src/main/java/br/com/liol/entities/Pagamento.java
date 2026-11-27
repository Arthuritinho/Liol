package br.com.liol.entities;

import java.time.LocalDate;

public class Pagamento {
    private int idPagamento;
    private String statusPagamento;
    private String matriculaAluno;
    private double valorPago;
    private LocalDate dataPagamento;
    private String formaPagamento;
    private String cpfResponsavel;

    public int getIdPagamento() { return idPagamento; }
    public void setIdPagamento(int idPagamento) { this.idPagamento = idPagamento; }

    public String getStatusPagamento() { return statusPagamento; }
    public void setStatusPagamento(String statusPagamento) { this.statusPagamento = statusPagamento; }

    public String getMatriculaAluno() { return matriculaAluno; }
    public void setMatriculaAluno(String matriculaAluno) { this.matriculaAluno = matriculaAluno; }

    public double getValorPago() { return valorPago; }
    public void setValorPago(double valorPago) { this.valorPago = valorPago; }

    public LocalDate getDataPagamento() { return dataPagamento; }
    public void setDataPagamento(LocalDate dataPagamento) { this.dataPagamento = dataPagamento; }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }

    public String getCpfResponsavel() { return cpfResponsavel; }
    public void setCpfResponsavel(String cpfResponsavel) { this.cpfResponsavel = cpfResponsavel; }
}