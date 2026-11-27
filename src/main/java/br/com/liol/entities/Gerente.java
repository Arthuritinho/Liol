package br.com.liol.entities;

public class Gerente extends Funcionario {
    private int cra;

    public Gerente() {
        setSalario(5000.00);
    }

    public int getCra() { return cra; }
    public void setCra(int cra) { this.cra = cra; }

    @Override
    public String getCargo() { return "Gerente"; }

    @Override
    public String getRegistroConselho() { return String.valueOf(cra); }
}