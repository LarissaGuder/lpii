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
@SequenceGenerator(name = "seq_ordem_compra", sequenceName = "seq_ordem_compra", allocationSize = 1)
@Table(name = "ordem_compra")
public class OrdemCompra implements Serializable {
    private int ordID;
    private String ordDescricao;
    private int ordQuantidade;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materiais")
    public int getOrdID() {
        return ordID;
    }

    public void setOrdID(int ordID) {
        this.ordID = ordID;
    }

    public String getOrdDescricao() {
        return ordDescricao;
    }

    public void setOrdDescricao(String ordDescricao) {
        this.ordDescricao = ordDescricao;
    }

    public int getOrdQuantidade() {
        return ordQuantidade;
    }

    public void setOrdQuantidade(int ordQuantidade) {
        this.ordQuantidade = ordQuantidade;
    }
    
}
