/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.dao.MateriaisDAO;
import com.mycompany.model.Materiais;
/**
 *
 * @author larig
 */
@Service("materiaisService")
public class MateriaisService {
    @Autowired
    private MateriaisDAO materiaisDAO;

    @Transactional
    public void save(Materiais materiais) {
        materiaisDAO.save(materiais);
    }

    @Transactional
    public void update(Materiais materiais) {
        materiaisDAO.update(materiais);
    }

    @Transactional
    public void delete(int id) {
        materiaisDAO.delete(id);
    }

    public Materiais findById(int id) {
        return materiaisDAO.findById(id);
    }

    public List<Materiais> findAll() {
        return materiaisDAO.findAll();
    }
    
}
