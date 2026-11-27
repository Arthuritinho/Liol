package br.com.liol.entities;

public class Instrutor extends Funcionario {
    private int cref;

    public Instrutor() {
        setSalario(2000.00);
    }

    public int getCref() { return cref; }
    public void setCref(int cref) { this.cref = cref; }

    @Override
    public String getCargo() { return "Instrutor"; }

    @Override
    public String getRegistroConselho() { return String.valueOf(cref); }
}