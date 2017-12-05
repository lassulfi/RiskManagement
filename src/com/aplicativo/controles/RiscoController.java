/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicativo.controles;

import com.aplicativo.entidades.Risco;
import java.util.ArrayList;

/**
 *
 * @author luis.assulfi
 */
public class RiscoController {
    
    public boolean cadastrarRisco(Risco r){
        boolean result = false;
        
        if(r != null && r.getCausa().length() > 0 &&
                r.getConsequencia().length() > 0 &&
                r.getCausa().length() > 0 &&
                r.getObjetivo().length() > 0 &&
                r.getImpactoRisco() != 0 &&
                r.getProbabilidadeRisco() != 0 &&
                r.getNivelDoRisco() != 0 &&
                r.getProcesso().length() > 0){    
            //Seta o código válilo
            r.setCodigo(RepositoryManager.getInstance().getContadorRiscos());          
            //Insere o modelo no banco de dados
            RepositoryManager.getInstance().cadastrarRiscos(r);
            result = true;
            
        }
        
        return result;
    }
    
    public boolean cadastrarAcoes(Risco r){
        boolean result = false;
        
        if (r != null && r.getTratamentoAcao().length() > 0 && 
                r.getMonitoramentoAcao().length() > 0 &&
                r.getResponsavelAcao().length() > 0 &&
                r.getPrazoAcao().toString().isEmpty() &&
                r.getProbabilidadeAcao() != 0 &&
                r.getImpactoAcao() != 0 &&
                r.getNivelImpactoAcao() != 0){
            //Seta o código válido
            r.setCodigo(RepositoryManager.getInstance().getContadorRiscos());
            //Atualiza o modelo no banco de dados
            RepositoryManager.getInstance().modificarLista(r);
            result = true;
        }
        
        return result;
    }
    
    public boolean atualizarRiscos(Risco r){
        boolean result = false;
        
        if(r != null && r.getCausa().length() > 0 &&
                r.getConsequencia().length() > 0 &&
                r.getCausa().length() > 0 &&
                r.getObjetivo().length() > 0 &&
                r.getImpactoRisco() != 0 &&
                r.getProbabilidadeRisco() != 0 &&
                r.getNivelDoRisco() != 0 &&
                r.getProcesso().length() > 0){
            //Seta o codigo valido
            r.setCodigo(RepositoryManager.getInstance().getContadorRiscos());
            //Atualiza o modelo no banco de dados
            RepositoryManager.getInstance().modificarLista(r);
            result = true;
        } 
            
        return result;
    }
    
    public boolean atualizarAcoes(Risco r){
        boolean result = false;
        if (r != null && r.getTratamentoAcao().length() > 0 && 
                r.getMonitoramentoAcao().length() > 0 &&
                r.getResponsavelAcao().length() > 0 &&
                r.getPrazoAcao().toString().length() > 0 &&
                r.getProbabilidadeAcao() != 0 &&
                r.getImpactoAcao() != 0 &&
                r.getNivelImpactoAcao() != 0){
            //Atualiza o modelo no banco de dados
            RepositoryManager.getInstance().modificarLista(r);
            result = true;
        }
        return result;
    }
    
    public boolean excluirItemRisco(Risco r){
        boolean result = false;
        if (r != null){
            RepositoryManager.getInstance().excluirItem(r);
            result = true;
        }
        return result;
    }
    
    public boolean exportarRiscos(String arquivo, String diretorio){
        boolean result = false;
        
        ArrayList<Risco> lista = RepositoryManager.getInstance().obterListaDeRiscos();
        
        if(!lista.isEmpty()){
            RepositoryManager.getInstance().fazerBackup(lista, arquivo, diretorio);
            result = true;
        }
        return result;
    }
    
    
    
}
