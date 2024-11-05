/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoblocknotas.Main;

import Pantallas.FrameDashBoard;
import com.mycompany.proyectoblocknotas.Nota.Nota;
import com.mycompany.proyectoblocnotas.Categorias.Categoria;
import com.mycompany.proyectoblocnotas.Categorias.ControladorCategoria;
import com.mycompany.proyectoblocnotas.Historico.ControladorHistorico;
import java.time.LocalDate;

/**
 *
 * @author Usuario 
 * Britany
 */
public class ProyectoBlockNotas {

    public static void main(String[] args) {
        FrameDashBoard historicopantalla = new FrameDashBoard();
        historicopantalla.setVisible(true);
        
        
        ControladorHistorico h =  new ControladorHistorico();
        
        Nota n = new Nota("Practica", 1, LocalDate.now());
        Nota n1 = new Nota("Practica2",2,LocalDate.now());
        Nota n2 = new Nota("Practica3",1, LocalDate.now());
        
        Categoria c = new Categoria(1, "Pendiente");
        Categoria c2 = new Categoria(2, "Proceso");
        Categoria c3 = new Categoria(3, "Completado");
        
        ControladorCategoria v = new ControladorCategoria();
        v.agregarCayegoria(c);
        v.agregarCayegoria(c2);
        v.agregarCayegoria(c3);
        
        h.agregarNota(n);
        h.agregarNota(n1);
        h.agregarNota(n2);


        
    }
}
