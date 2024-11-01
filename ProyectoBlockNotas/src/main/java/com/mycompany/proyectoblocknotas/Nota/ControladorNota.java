/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Nota;

/**
 *
 * @author Usuario
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ControladorNota {
    
    
    private static final String FILE_NAME ="notas.dat";
    private List<Nota> notas;
    
    
    
    
    
    
    
    
    
    
    
    
    
     private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            notas = (List<Nota>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
     public void NotasController() {
        notas = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarNota(Nota nota) {
        notas.add(nota);
        guardarDatos();
    }

    // Leer
    public List<Nota> obtenerNotas() {
        return notas;
    }

    // Actualizar
    public void actualizarNotas(int index, Nota nuevaNota) {
        if (index >= 0 && index < notas.size()) {
            notas.set(index, nuevaNota);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarNotas(int index) {
        if (index >= 0 && index < notas.size()) {
            notas.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

   
    

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(notas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


