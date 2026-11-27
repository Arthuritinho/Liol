package br.com.liol.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroPonto {
    private int idPonto;
    private String matriculaFunc;
    private LocalDate dataRegistro;
    private LocalTime horaEntrada;
    private LocalTime horaIntervalo;
    private LocalTime horaRetorno;
    private LocalTime horaSaida;

    public int getIdPonto() { return idPonto; }
    public void setIdPonto(int idPonto) { this.idPonto = idPonto; }

    public String getMatriculaFunc() { return matriculaFunc; }
    public void setMatriculaFunc(String matriculaFunc) { this.matriculaFunc = matriculaFunc; }

    public LocalDate getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDate dataRegistro) { this.dataRegistro = dataRegistro; }

    public LocalTime getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(LocalTime horaEntrada) { this.horaEntrada = horaEntrada; }

    public LocalTime getHoraIntervalo() { return horaIntervalo; }
    public void setHoraIntervalo(LocalTime horaIntervalo) { this.horaIntervalo = horaIntervalo; }

    public LocalTime getHoraRetorno() { return horaRetorno; }
    public void setHoraRetorno(LocalTime horaRetorno) { this.horaRetorno = horaRetorno; }

    public LocalTime getHoraSaida() { return horaSaida; }
    public void setHoraSaida(LocalTime horaSaida) { this.horaSaida = horaSaida; }
}