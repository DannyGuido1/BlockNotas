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
    
    private String completados;
    private String pendiente;

    public Categoria(String competados, String pendiente) {
        this.completados = competados;
        this.pendiente = pendiente;
    }

    public String getCompletados() {
        return completados;
    }

    public void setCompletados(String completados) {
        this.completados = completados;
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
