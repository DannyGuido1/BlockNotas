/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Usuario;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private int id;
    private String contrasenna;

    public Usuario(String nombre, int id, String contrasenna) {
        this.nombre = nombre;
        this.id = id;
        this.contrasenna = contrasenna;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the contrasenna
     */
    public String getContrasenna() {
        return contrasenna;
    }

    /**
     * @param contrasenna the contrasenna to set
     */
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    
}
