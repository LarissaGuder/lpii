/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import org.springframework.stereotype.Repository;
import com.mycompany.model.Materiais;
/**
 *
 * @author larig
 */
@Repository("materiaisDAO")
public class MateriaisDAO extends DAO<Materiais>{

    public MateriaisDAO() {
        classe = Materiais.class; 
    }
   
    
    
}
