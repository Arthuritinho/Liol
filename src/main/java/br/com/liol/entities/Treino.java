package br.com.liol.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Treino {
    private int idTreino;
    private String nomeTreino;
    private String objetivo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private int idListaExercicios;
    private String nomeLista; // Ex: Treino A, Treino B, Treino C
    private List<ItemTreino> itens = new ArrayList<>();

    public int getIdTreino() { return idTreino; }
    public void setIdTreino(int idTreino) { this.idTreino = idTreino; }

    public String getNomeTreino() { return nomeTreino; }
    public void setNomeTreino(String nomeTreino) { this.nomeTreino = nomeTreino; }

    public String getObjetivo() { return objetivo; }
    public void setObjetivo(String objetivo) { this.objetivo = objetivo; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    public int getIdListaExercicios() { return idListaExercicios; }
    public void setIdListaExercicios(int idListaExercicios) { this.idListaExercicios = idListaExercicios; }

    public String getNomeLista() { return nomeLista; }
    public void setNomeLista(String nomeLista) { this.nomeLista = nomeLista; }

    public List<ItemTreino> getItens() { return itens; }
    public void setItens(List<ItemTreino> itens) { this.itens = itens; }
}