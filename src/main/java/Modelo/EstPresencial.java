/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class EstPresencial extends Estudiantes{
    public EstPresencial (String nombre, int codigo){
        super (nombre,codigo);
    }
@Override
public String toString(){
return "Estudiante Presencial ->" + super.toString();
}

    
    
}
