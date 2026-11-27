package br.com.liol.entities;

public class Recepcionista extends Funcionario {

    public Recepcionista() {
        setSalario(1542.00);
    }

    @Override
    public String getCargo() { return "Recepcionista"; }

    @Override
    public String getRegistroConselho() { return "N/A"; }
}