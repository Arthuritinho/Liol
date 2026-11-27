package br.com.liol.entities;

public class Exercicio {
    private int idExercicio;
    private String nomeExercicio;
    private String areaMuscular;

    public Exercicio() {}

    public Exercicio(int idExercicio, String nomeExercicio, String areaMuscular) {
        this.idExercicio = idExercicio;
        this.nomeExercicio = nomeExercicio;
        this.areaMuscular = areaMuscular;
    }

    public int getIdExercicio() { return idExercicio; }
    public void setIdExercicio(int idExercicio) { this.idExercicio = idExercicio; }

    public String getNomeExercicio() { return nomeExercicio; }
    public void setNomeExercicio(String nomeExercicio) { this.nomeExercicio = nomeExercicio; }

    public String getAreaMuscular() { return areaMuscular; }
    public void setAreaMuscular(String areaMuscular) { this.areaMuscular = areaMuscular; }

    @Override
    public String toString() {
        return nomeExercicio + " (" + areaMuscular + ")";
    }
}