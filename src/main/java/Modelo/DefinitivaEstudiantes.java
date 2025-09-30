/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Vero
 */
public class DefinitivaEstudiantes {
    private double definitiva;
    private String apruebaNoAprueba;
    public DefinitivaEstudiantes(double notaDesarrollo, double notaMatematicas){
        definitiva=(notaDesarrollo*0.55)+(notaMatematicas*0.45);
        if(definitiva<3.5){
            apruebaNoAprueba = "NO APRUEBA";
        }else{
            apruebaNoAprueba = "SI APRUEBA";
        }  
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    public void setApruebaNoAprueba(String apruebaNoAprueba) {
        this.apruebaNoAprueba = apruebaNoAprueba;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public String getApruebaNoAprueba() {
        return apruebaNoAprueba;
    }
    
    @Override
    public String toString(){
        return " | Definitiva: "+String.format("%.2f",definitiva)+ " |El estudiante "+apruebaNoAprueba;
    }
}
