/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.mycompany.model.Materiais;
import com.mycompany.service.MateriaisService;

/**
 *
 * @author larig
 */
@ManagedBean
@ViewScoped
public class MateriaisBean {

    private boolean formAtivo = false;

    private Materiais materiais = new Materiais();
    private List<Materiais> todosMateriais;
    @ManagedProperty("#{materiaisService}")
    private MateriaisService materiaisService;

        public void save() {
        if (materiais.getMatId()> 0) {
            materiaisService.update(materiais);
        } else {
            materiaisService.save(materiais);
        }
        todosMateriais = materiaisService.findAll();
        this.formAtivo = false;
    }

    public void cancel() {
        this.formAtivo = false;
        this.materiais = new Materiais();
    }

    public void add() {
        this.formAtivo = true;
        this.materiais = new Materiais();
    }

    public void excluir(Materiais materiais) {
     
            materiaisService.delete(materiais.getMatId());
            todosMateriais.remove(materiais);
        
    }

    public void prepareEdit(Materiais materiais) {
        this.formAtivo = true;
        this.materiais = materiais;
    }
    
    public boolean isFormAtivo() {
        return formAtivo;
    }

    public void setFormAtivo(boolean formAtivo) {
        this.formAtivo = formAtivo;
    }

    public Materiais getMateriais() {
        return materiais;
    }

    public void setMateriais(Materiais materiais) {
        this.materiais = materiais;
    }

    public List<Materiais> getTodosMateriais() {
        return todosMateriais;
    }

    public void setTodosMateriais(List<Materiais> todosMateriais) {
        this.todosMateriais = todosMateriais;
    }

    public MateriaisService getMateriaisService() {
        return materiaisService;
    }

    public void setMateriaisService(MateriaisService materiaisService) {
        this.materiaisService = materiaisService;
    }

    
}
