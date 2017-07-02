/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;
import com.mycompany.model.Produto;
import org.springframework.stereotype.Repository;
/**
 *
 * @author larig
 */
@Repository("produtoDAO")
public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
    classe = Produto.class;
    }
    
}
