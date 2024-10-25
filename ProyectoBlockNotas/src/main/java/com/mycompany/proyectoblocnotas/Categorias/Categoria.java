/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocnotas.Categorias;

/**
 *
 * @author jerem
 */
public class Categoria {
    
    private String competados;
    private String pendiente;

    public Categoria(String competados, String pendiente) {
        this.competados = competados;
        this.pendiente = pendiente;
    }

    public String getCompetados() {
        return competados;
    }

    public void setCompetados(String competados) {
        this.competados = competados;
    }

    public String getPendiente() {
        return pendiente;
    }

    public void setPendiente(String pendiente) {
        this.pendiente = pendiente;
    }

    void add(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
