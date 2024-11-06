/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoblocnotas.Historico;

import com.mycompany.proyectoblocknotas.Nota.Nota;
import com.mycompany.proyectoblocknotas.Usuario.Usuario;
import com.mycompany.proyectoblocnotas.Categorias.Categoria;
import static com.sun.tools.attach.VirtualMachine.list;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author jerem
 */
public class ControladorHistorico {

   
    
    
    
    private static final String FILE_NAME ="historico.dat";
    private List<Nota> notas;
    
    public ControladorHistorico() {
        notas = new ArrayList<>();
        cargarDatos();
    }
    
     private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            notas = (List<Nota>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
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
    public Object[][] RefrescarData(String fechaInicio, String fechaFin){
              

         DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd MM yyyy");
         LocalDate dFechaInicio = LocalDate.parse(fechaInicio, formato1);

         DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd MM yyyy");
         LocalDate dFechaFin = LocalDate.parse(fechaFin, formato2);
        int cont = 0;
        List<Nota> hist = obtenerNotas();
        Object[][] hi = new Object[hist.size()][3];
        Optional<Nota> fe = hist.stream().filter(e -> e.getFechaCreacion().isAfter(dFechaFin)&&e.getFechaCreacion().isAfter(dFechaInicio)).findFirst();
        ArrayList<Nota> fe = optional.
        for (Nota nota : fe) {
            hi[cont][0] = nota.getContenido();
            hi[cont][1] = nota.getFechaCreacion().toString();
            hi[cont][2] = nota.getFechaCaducidad().toString();
            
            

            if(!fe.isEmpty())
            {
                hi[cont][2] = fe.get();
            }
            hi[cont][2] = "N/A";
            cont++;
        }
        
//        getId()==nota.getIdcategoria()
        
//        Optional<Nota> fe = hist.stream().filter(e->e.getFechaCreacion() > e.getFechaCaducidad() && e.getFechaCreacion() < e.getFechaCaducidad()).findFirst();
        
          //codigo para despues poner y acordarse ( pasar un optional a arraylist y mostrarlo en la parte de historico comparando la fecha de inicio y fecha de fin un rangopara ver las notas en ese rango
//          ArrayList<String> list = optional.map(value -> {
//            ArrayList<String> newList = new ArrayList<>();
//            newList.add(value);  // Agrega el valor dentro del Optional
//            return newList;


        return null;
        
    }
    
    
}
