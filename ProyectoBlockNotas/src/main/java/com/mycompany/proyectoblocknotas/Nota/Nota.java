/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Nota;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class Nota {
    
    
    private String contenido;
    private LocalDateTime horaCreacion;
    private int numeroNota;

    public Nota(String contenido, LocalDateTime horaCreacion, int numeroNota) {
        this.contenido = contenido;
        this.horaCreacion = LocalDateTime.now();
        this.numeroNota = numeroNota;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the horaCreacion
     */
    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    /**
     * @param horaCreacion the horaCreacion to set
     */
    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    /**
     * @return the numeroNota
     */
    public int getNumeroNota() {
        return numeroNota;
    }

    /**
     * @param numeroNota the numeroNota to set
     */
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }
    
    
    
    
}
