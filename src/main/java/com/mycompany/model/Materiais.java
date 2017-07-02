/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author larig
 */
@Entity
@SequenceGenerator(name = "seq_materiais", sequenceName = "seq_materiais", allocationSize = 1)
@Table(name = "materiais")
public class Materiais implements Serializable {
   
    private int matId;
    private String matDescricao;
    private int matQuantidade;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materiais")
    public int getMatId() {
        return matId;
    }

    public void setMatId(int matId) {
        this.matId = matId;
    }

    public String getDescricao() {
        return matDescricao;
    }

    public void setDescricao(String descricao) {
        this.matDescricao = descricao;
    }

    public int getMatQuantidade() {
        return matQuantidade;
    }

    public void setMatQuantidade(int matQuantidade) {
        this.matQuantidade = matQuantidade;
    }
    
    
    
}
