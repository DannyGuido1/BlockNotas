/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocnotas.Categorias;

import com.mycompany.proyectoblocknotas.Usuario.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
public class ControladorCategoria {
    
    private static final String FILE_NAME ="categoria.dat";
    private List<Categoria> categorias;
    
    public ControladorCategoria()
    {
        categorias = new ArrayList<>();
    }
    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            categorias = (List<Categoria>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            
            
        }
         }
    
     public void ControladorCategoria() {
        categorias = new ArrayList<>();
        cargarDatos();
    }
     
      // Crear
    public void agregarCayegoria(Categoria categoria) {
        categorias.add(categoria);
        guardarDatos();
        
    }

   // Leer
    public List<Categoria> obtenerCategorias() {
        return categorias;
    }
     // Actualizar
    public void actualizarCategorias(int index, Categoria nuevoCategoria) {
        if (index >= 0 && index < categorias.size()) {
            categorias.set(index, nuevoCategoria);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarCategoria(int index) {
        if (index >= 0 && index < categorias.size()) {
            categorias.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(categorias);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
