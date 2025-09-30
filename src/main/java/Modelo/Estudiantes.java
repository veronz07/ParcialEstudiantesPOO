/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Vero
 */
public class Estudiantes {
    private String nombre;
    private int codigo;
    
    public Estudiantes(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void setEstudiante(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    

    
    @Override
    
    public String toString() {
        return "Nombre: " + nombre + " | Codigo: " + codigo;
    }
    
    
    
    
    
    
    
}
