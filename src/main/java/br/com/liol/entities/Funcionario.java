package br.com.liol.entities;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    private String matriculaFunc;
    private LocalDate dataAdmissao;
    private String statusFuncionario;
    private double salario;
    private int idSetor;
    private String supervisorMatricula;

    public Funcionario() {
        super();
    }

    public abstract String getCargo();
    public abstract String getRegistroConselho();

    public String getMatriculaFunc() { return matriculaFunc; }
    public void setMatriculaFunc(String matriculaFunc) { this.matriculaFunc = matriculaFunc; }

    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }

    public String getStatusFuncionario() { return statusFuncionario; }
    public void setStatusFuncionario(String statusFuncionario) { this.statusFuncionario = statusFuncionario; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public int getIdSetor() { return idSetor; }
    public void setIdSetor(int idSetor) { this.idSetor = idSetor; }

    public String getSupervisorMatricula() { return supervisorMatricula; }
    public void setSupervisorMatricula(String supervisorMatricula) { this.supervisorMatricula = supervisorMatricula; }

    @Override
    public String toString() {
        return getNomeCompleto() + " (" + getCargo() + ") - " + matriculaFunc;
    }
}