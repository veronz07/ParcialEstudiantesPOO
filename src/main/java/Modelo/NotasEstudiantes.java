/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class NotasEstudiantes {
    private double notaDesarrollo;
    private double notaMatematicas;

    public NotasEstudiantes(double notaDesarrollo, double notaMatematicas) {
        this.notaDesarrollo = notaDesarrollo;
        this.notaMatematicas = notaMatematicas;
    }

    public void setNotaDesarrollo(double notaDesarrollo) {
        this.notaDesarrollo = notaDesarrollo;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaDesarrollo() {
        return notaDesarrollo;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    @Override
    public String toString() {
        return " | Desarrollo: " + notaDesarrollo + " | Matemática: " + notaMatematicas;
    }
}

    

