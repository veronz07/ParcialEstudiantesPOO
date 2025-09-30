/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;



/**
 *
 * @author Vero
 */
public class ListarEstudiantes {
    
    public String mostrarLista(String[] nombres, int[] codigos, double[] notasDesarrollo, double[] notasMatematicas, double[] definitivas, String[] aprobaciones){
        for (int i = 0; i<definitivas.length-1;i++) { 
            for(int j=0; j< definitivas.length-1-i;j++){
                if (definitivas[j]> definitivas[j+1]){
                    
                    double definitivaTemporal= definitivas[j];
                    definitivas[j]= definitivas[j+1];
                    definitivas[j+1]=definitivaTemporal;
                    
                    String nombreTemporal= nombres[j];
                    nombres[j] = nombres [j+1];
                    nombres[j+1] = nombreTemporal;
                    
                    int codigoTemporal = codigos[j];
                    codigos[j] = codigos[j+1];
                    codigos[j+1] = codigoTemporal;
                    
                    double notaDTemporal= notasDesarrollo[j];
                    notasDesarrollo[j] = notasDesarrollo[j+1];
                    notasDesarrollo[j+1] = notaDTemporal;
                    
                    double notaMTemporal= notasMatematicas[j];
                    notasMatematicas[j] = notasMatematicas[j+1];
                    notasMatematicas[j+1] = notaMTemporal;
                    
                    String aprobacionTemporal= aprobaciones[j];
                    aprobaciones[j] = aprobaciones[j+1];
                    aprobaciones[j+1] = aprobacionTemporal;

                }
            }
        } 
        
        String informacion= "";
        for (int i=0;i<definitivas.length;i++){
            Estudiantes est = new Estudiantes(nombres[i], codigos[i]);
            NotasEstudiantes notas = new NotasEstudiantes(notasDesarrollo[i], notasMatematicas[i]);
            DefinitivaEstudiantes def = new DefinitivaEstudiantes(notasDesarrollo[i], notasMatematicas[i]);
            
            informacion+= est.toString()+notas.toString()+def.toString()+"\n";
                    
                        
        }
        return informacion;
    }
  
}
