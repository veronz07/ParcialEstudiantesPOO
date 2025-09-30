/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import javax.swing.JOptionPane;
import Modelo.ListarEstudiantes;
import Modelo.Estudiantes;
import Modelo.NotasEstudiantes;
import Modelo.DefinitivaEstudiantes;
import Modelo.EstPresencial;
import Modelo.EstVirtual;

/**
 *
 * @author Vero
 */
public class TecnologiaEstudiantes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int numEst=Integer.parseInt(JOptionPane.showInputDialog("Inrese la cantidad de estudiantes en el curso: "));
        
        String [] nombres = new String[numEst];
        int[] codigos = new int [numEst];
        double[] notasDesarrollo = new double [numEst];
        double[] notasMatematicas = new double [numEst];
        double[] definitivas = new double [numEst];
        String[] aprobaciones = new String [numEst];
             
        for (int i=0;i<numEst;i++){
            int modalidad = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione el tipo de estudiante:\n"
                    + "1. Presencial\n"
                    + "2. Virtual"));
            
             String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
            int codigo;
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código (>21000):"));
                if (codigo <= 21000) {
                    JOptionPane.showMessageDialog(null, "El código ingresado no es válido");
                }
            } while (codigo <= 21000);
            Estudiantes est;
            if (modalidad == 1) {
                est = new EstPresencial(nombre, codigo);
            } else {
                est = new EstVirtual(nombre, codigo);
            }

            
            double notaDesarrollo;
            double notaMatematicas;
            
            do{
                notaDesarrollo= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de Desarrollo del estudiante "+nombre+" : "));
                notaMatematicas= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de Matemáticas del estudiante "+nombre+" : "));
                if(notaDesarrollo>5 || notaMatematicas>5){
                    JOptionPane.showMessageDialog(null, "La nota ingresada no es válida, ingrese una nota entre 0.0 y 5.0");
                }
            }while (notaDesarrollo>5 || notaMatematicas>5);
            
            NotasEstudiantes notas = new NotasEstudiantes (notaDesarrollo,notaMatematicas);
            
            DefinitivaEstudiantes def = new DefinitivaEstudiantes(notaDesarrollo, notaMatematicas);
            
            nombres[i] = est.getNombre();
            codigos[i] = est.getCodigo();
            notasDesarrollo[i] = notas.getNotaDesarrollo();
            notasMatematicas[i] = notas.getNotaMatematicas();
            definitivas[i] = def.getDefinitiva();
            aprobaciones[i] =def.getApruebaNoAprueba();

        }
        
        ListarEstudiantes lista = new ListarEstudiantes();
        String resultado = lista.mostrarLista(nombres, codigos, notasDesarrollo, notasMatematicas, definitivas, aprobaciones);
        
        JOptionPane.showMessageDialog(null,resultado);
 


       

            
            
                
    }
        
}

