/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;
import com.mycompany.model.Pedido;
import org.springframework.stereotype.Repository;

/**
 *
 * @author larig
 */
@Repository("pedidoDAO")
public class PedidoDAO extends DAO<Pedido> {

    public PedidoDAO() {
    classe = Pedido.class;
    }
    
    
}
