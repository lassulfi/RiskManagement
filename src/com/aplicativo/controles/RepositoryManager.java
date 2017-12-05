/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicativo.controles;

import com.aplicativo.entidades.Risco;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luis.assulfi
 */
public class RepositoryManager {

    private static RepositoryManager INSTANCE;

    private long contador = 1;

    //Criando uma ArrayList para armazenar os riscos
    private ArrayList<Risco> listaRisco;

    //Construtor private
    private RepositoryManager() {
        listaRisco = new ArrayList<Risco>();
        obterListaDeRiscos();
    }

    //Singleton
    public static RepositoryManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RepositoryManager();
        }
        return INSTANCE;
    }

    public long getContadorRiscos() {
        return contador;
    }

    public ArrayList<Risco> obterListaDeRiscos() {
        return listaRisco;
    }

    public void cadastrarRiscos(Risco r) {
        //Adiciona o risco ao banco de dados
        listaRisco.add(r);
        //Atualizando o contador
        contador++;
        System.out.println(r.toString());

    }

    public void cadastrarAcoes(int posicao, Risco r, ArrayList<Risco> lista) {
        //Atualiza o banco da dados com as informações referente aos demais dados
        lista.set(posicao, r);
        System.out.println(r.toString());

    }

    /**
     * Lista com Dummy Data para testes
     */
    private void insertDummyData() {

        Date data = new Date();

        for (int i = 0; i <= 5; i++) {
            Risco r = new Risco(new Long(contador),
                    "Processo " + i,
                    "Objetivo " + i,
                    "Risco " + i,
                    "Causa " + i,
                    "Consequencia " + i,
                    "Natureza",
                    1,
                    1,
                    1,
                    "",
                    "",
                    "",
                    data,
                    0,
                    0,
                    0);

            contador++;
            listaRisco.add(r);

            r.toString();

        }
    }

    /**
     * Método para editar um risco em uma lista
     *
     * @param r é o risco
     */
    public void modificarLista(Risco r) {
        if (listaRisco.contains(r)) {
            int indice = listaRisco.indexOf(r);
            listaRisco.set(indice, r);

        }

    }

    /**
     * Método para excluir um risco em uma lista
     *
     * @param r é o risco a ser excluido
     */
    public void excluirItem(Risco r) {
        if (listaRisco.contains(r)) {
            int indice = listaRisco.indexOf(r);
            listaRisco.remove(indice);
        }
    }

    /**
     * Método para realizar o backup dos dados
     *
     * @param r dados que serão salvos no arquivo de backup
     * @param arquivo nome do arquivo
     * @param diretorio nome do diretorio
     */
    public void fazerBackup(ArrayList<Risco> r, String arquivo, String diretorio) {

        //Tenta criar o diretorio e arquivo de backup
        File dir = new File(diretorio);
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Diretorio criado");
        } else {
            System.out.println("Diretorio ja existe");
        }     

        //Gerando o nome completo do arquivo
        arquivo = diretorio + arquivo + ".grh";
        //arquivo += ".grh";
        //Tentando criar o arquivo de backup
        try {
            File file = new File(arquivo);
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(r);
            output.flush();
            output.close();
        } catch (IOException e) {
            System.out.println("Não foi possível fazer o backup");
            System.out.println(e.toString());
        }
    }
    
    public void importarBackup(File f){
             
        //Risco r = null;
        
        //Cria o objeto arquivo
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(f));
            listaRisco = (ArrayList<Risco>) input.readObject();
            //listaRisco.add(r);
            input.close();
        } catch (ClassNotFoundException e){
            System.out.println("Erro com o objeto");
            System.out.println(e.toString());
        } catch (IOException e){
            System.out.println("Não foi possível importar dados");
            System.out.println(e.toString());
        }   
        System.out.println("Dados importados");
        //System.out.println(r.toString());
    }

}
