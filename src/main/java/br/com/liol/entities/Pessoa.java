package br.com.liol.entities;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

    private String cpf;
    private String nomeCompleto;
    private LocalDate dataNasc;
    private char genero;
    private int idade;
    private String logradouro;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    private String senhaHash;

    public Pessoa() {}

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public LocalDate getDataNasc() { return dataNasc; }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
        if (dataNasc != null) {
            this.idade = Period.between(dataNasc, LocalDate.now()).getYears();
        }
    }

    public char getGenero() { return genero; }
    public void setGenero(char genero) { this.genero = genero; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenhaHash() { return senhaHash; }
    public void setSenhaHash(String senhaHash) { this.senhaHash = senhaHash; }
}