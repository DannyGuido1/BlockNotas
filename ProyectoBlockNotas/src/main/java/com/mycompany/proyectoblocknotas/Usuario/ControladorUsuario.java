/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocknotas.Usuario;

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
            usuarios=new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            
            
        }
         }
    
     public void ControladorUsuario() {
        usuarios = new ArrayList<>();
        cargarDatos();
    }
     
      // Crear
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        guardarDatos();
        
    }

   // Leer
    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }
     // Actualizar
    public void actualizarUsuarios(int index, Usuario nuevoUsuario) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.set(index, nuevoUsuario);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarUsuario(int index) {
        if (index >= 0 && index < usuarios.size()) {
            usuarios.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }
    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
 
//AGREGUE EL INICIO DE SESION, VERIFICAR CON EL PROFE
public boolean inicioSesion(Usuario nuevoUsuario) {
    
    boolean encontrado = false;
    
    for (Usuario usuario : usuarios) {
        if (usuario.getNombre().equals(nuevoUsuario.getNombre()) &&
            usuario.getContrasenna().equals(nuevoUsuario.getContrasenna())) {
            System.out.println("Accediendo");
            encontrado = true;
            break;
        }
    }
    
    if (!encontrado) {
        System.out.println("El usuario o la contraseña no coinciden");
}
    return encontrado;
}
        

//RECORDATORIO PARA MI PREGUNTAR COMO BUSCAR DESDE EL ARCHIVO PLANO EN VEZ DE LA LISTA

public void buscarUsuarioPorNombre(String nombre) {
    for (Usuario usuario : usuarios) {
        if (usuario.getNombre().equals(nombre)) {
            System.out.println("Usuario encontrado:");
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Contraseña: " + usuario.getContrasenna()); 
            return; 
        }
       }
    
    System.out.println("No se encontró un usuario con ese nombre.");
}


    }
    

    
