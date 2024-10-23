/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Usuario;

import com.mycompany.proyectoblocknotas.Nota.Nota;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorUsuario {
    
    
    private static final String FILE_NAME ="usuario.dat";
    private List<Usuario> usuarios;
    
    
    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            usuarios = (List<Usuario>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            
            
        }
         }
    
     public void NotasController() {
        usuarios = new ArrayList<>();
        cargarDatos();
    }
     
      // Crear
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        guardarDatos();
        
    }

    private void guardarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
