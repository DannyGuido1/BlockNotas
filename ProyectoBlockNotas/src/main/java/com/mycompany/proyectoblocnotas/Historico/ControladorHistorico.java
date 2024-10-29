/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocnotas.Historico;

import com.mycompany.proyectoblocknotas.Nota.Nota;
import com.mycompany.proyectoblocknotas.Usuario.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jerem
 */
public class ControladorHistorico {
    
    private static final String FILE_NAME ="historico.dat";
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


    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(notas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void ValidacionHistorico(Nota nuevoNota) {
    
    LocalDate FechaActual = LocalDate.now();
    
    for (Nota notas1 : notas) {
        if (FechaActual.isBefore(notas1.getFechaCaducidad())){
            System.out.println("Vencido");

            break;
        }

}
}
}