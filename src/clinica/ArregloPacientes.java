/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author Andrea Itzhel
 */
public class ArregloPacientes {
    private ArrayList<Paciente> objPa;

    public ArregloPacientes() {
        objPa = new ArrayList<Paciente>();
    }
    
    public void agregar(Paciente pa){
        objPa.add(pa);
    }
    
    public void borrar(Paciente pa){
        objPa.remove(pa);
    }
    public Paciente obtener(int pos){
        return objPa.get(pos);
    }
    public Paciente buscar(String nombre){
        for (int i = 0; i < objPa.size(); i++) {
            if(nombre.equals(objPa.get(i).getNombre()))
                return objPa.get(i);
        }
         return null;
    }
    public int numElementos(){
        return objPa.size();
    }
    public void leerDatos(){
        cargar();
    }
    
    private void cargar() {
        try {
            
            File archivo = new File("pacientes.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String nombre = st.nextToken().trim();
                    String domicilio = st.nextToken().trim();
                    String fecha_nac = st.nextToken().trim();
                    String no_afil = st.nextToken().trim();
                    String tel = st.nextToken().trim();
                    String fecha_ingre = st.nextToken().trim();
                    String fecha_sub = st.nextToken().trim();
                    
                    Paciente pa = new Paciente(nombre,domicilio,fecha_nac,no_afil,tel,fecha_ingre,fecha_sub);
                    agregar(pa);
                }
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("pacientes.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getNombre()+","+obtener(i).getDomicilio()+","+
                        obtener(i).getFechaNac()+","+obtener(i).getNoAfil()+","+obtener(i).getTel()+","+
                        obtener(i).getFechaIngre()+","+obtener(i).getFechaSub());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
}
