/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.stereotype.Repository;
import com.mycompany.model.OrdemCompra;
/**
 *
 * @author larig
 */
@Repository("ordemCompraDAO")
public class OrdemCompraDAO extends DAO<OrdemCompra>{

    public OrdemCompraDAO() {
    classe = OrdemCompra.class;
    }
    
    
}
