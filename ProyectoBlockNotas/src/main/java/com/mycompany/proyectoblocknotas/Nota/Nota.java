/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Nota;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Nota implements Serializable{
    
    
    private String contenido;
    private LocalDate FechaCreacion;
    private int numeroNota;
    private int idcategoria;
    private LocalDate FechaCaducidad;

    public Nota(String contenido, LocalDate FechaCreacion, int numeroNota, int idcategoria, LocalDate FechaCaducidad) {
        this.contenido = contenido;
        this.FechaCreacion = FechaCreacion;
        this.numeroNota = numeroNota;
        this.idcategoria = idcategoria;
        this.FechaCaducidad = FechaCaducidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public LocalDate getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    
    

    
    
    
    
    
}
