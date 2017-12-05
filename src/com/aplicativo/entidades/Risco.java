/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicativo.entidades;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author luis.assulfi
 */
public class Risco implements Serializable {
    
    //Atributos da classe
    private Long codigo;
    private String processo;
    private String objetivo;
    private String nomeRisco;
    private String causa;
    private String consequencia;
    private String natureza;
    private int probabilidadeRisco;
    private int impactoRisco;
    private int nivelDoRisco;
    private String tratamentoAcao;
    private String monitoramentoAcao;
    private String responsavelAcao;
    private Date prazoAcao;
    private int probabilidadeAcao;
    private int impactoAcao;
    private int nivelImpactoAcao;
    

    //construtor
    public Risco(Long codigo, String processo, String objetivo, String nomeRisco, String causa,
            String consequencia, String natureza, int probabilidadeRisco,
            int impactoRisco, int nivelDoRisco, String tratamentoAcao, 
            String monitoramentoAcao, String responsavelAcao, Date prazoAcao, int probabilidadeAcao,
            int impactoAcao, int nivelImpactoAcao) {
        this.codigo = codigo;
        this.processo = processo;
        this.objetivo = objetivo;
        this.nomeRisco = nomeRisco;
        this.causa = causa;
        this.consequencia = consequencia;
        this.natureza = natureza;
        this.probabilidadeRisco = probabilidadeRisco;
        this.impactoRisco = impactoRisco;
        this.nivelDoRisco = nivelDoRisco;
        this.tratamentoAcao = tratamentoAcao;
        this.monitoramentoAcao = monitoramentoAcao;
        this.responsavelAcao = responsavelAcao;
        this.prazoAcao = prazoAcao;
        this.probabilidadeAcao = probabilidadeAcao;
        this.impactoAcao = impactoAcao;
        this.nivelImpactoAcao = nivelImpactoAcao;
    }  
       
    //métodos da classe
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public String getNomeRisco() {
        return nomeRisco;
    }

    public void setNomeRisco(String nomeRisco) {
        this.nomeRisco = nomeRisco;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getConsequencia() {
        return consequencia;
    }

    public void setConsequencia(String consequencia) {
        this.consequencia = consequencia;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public int getProbabilidadeRisco() {
        return probabilidadeRisco;
    }

    public void setProbabilidadeRisco(int probabilidade) {
        this.probabilidadeRisco = probabilidade;
    }

    public int getImpactoRisco() {
        return impactoRisco;
    }

    public void setImpactoRisco(int impacto) {
        this.impactoRisco = impacto;
    }

    public int getNivelDoRisco() {
        return nivelDoRisco;
    }

    public void setNivelDoRisco(int nivelDoRisco) {
        this.nivelDoRisco = nivelDoRisco;
    }

    public String getTratamentoAcao() {
        return tratamentoAcao;
    }

    public void setTratamentoAcao(String tratamentoAcao) {
        this.tratamentoAcao = tratamentoAcao;
    }

    public String getMonitoramentoAcao() {
        return monitoramentoAcao;
    }

    public void setMonitoramentoAcao(String monitoramentoAcao) {
        this.monitoramentoAcao = monitoramentoAcao;
    }

    public String getResponsavelAcao() {
        return responsavelAcao;
    }

    public void setResponsavelAcao(String responsavelAcao) {
        this.responsavelAcao = responsavelAcao;
    }

    public Date getPrazoAcao() {
        return prazoAcao;
    }

    public void setPrazoAcao(Date prazoAcao) {
        this.prazoAcao = prazoAcao;
    }

    public int getProbabilidadeAcao() {
        return probabilidadeAcao;
    }

    public void setProbabilidadeAcao(int probabilidadeAcao) {
        this.probabilidadeAcao = probabilidadeAcao;
    }

    public int getImpactoAcao() {
        return impactoAcao;
    }

    public void setImpactoAcao(int impactoAcao) {
        this.impactoAcao = impactoAcao;
    }

    public int getNivelImpactoAcao() {
        return nivelImpactoAcao;
    }

    public void setNivelImpactoAcao(int nivelImpactoAcao) {
        this.nivelImpactoAcao = nivelImpactoAcao;
    }
    
    @Override
    public String toString() {
        String valores = "codigo=" + codigo +
                ", processo=" + processo +
                ", objetivo=" + objetivo + 
                ", nome do risco= " + nomeRisco +
                ", causa=" + causa + 
                ", consequencia=" + consequencia +
                ", natureza=" + natureza + 
                ", probabilidadeRisco=" + probabilidadeRisco +
                ", impactoRisco=" + impactoRisco + 
                ", nivelDoRisco=" + nivelDoRisco + 
                ", tratamentoAcao=" + tratamentoAcao +
                ", monitoramentoAcao=" + monitoramentoAcao + 
                ", responsavelAcao= " + responsavelAcao +
                ", prazoAcao= " + prazoAcao +
                ", probabilidadeAcao= " + probabilidadeAcao +
                ", impactoAcao= " + impactoAcao +
                ", nivelImpactoAcao= " + nivelImpactoAcao;
        return valores;
    }   
     
}
