/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR1;

import GramaticaDeGramaticas.Gramatica;

/**
 *
 * @author xXEdG
 */
public class TestAlgoritmoLR1 {
        public static void main(String[] args) {
        Gramatica gramatica = new Gramatica();
        GramaticaLR1 gramaticaDeGramaticaLR0 = new GramaticaLR1(gramatica);
        String cadena =   
<<<<<<< HEAD
            /*"S' -> S ;" +
            "S -> E - E | f ;" +
=======
            "S' -> S ;" +
            "S -> E = E | f ;" +
>>>>>>> edda49ca00cb0ad10840e365c4ce7347f0c45e2e
            "E -> T | E + T ;" +
            "T -> f | T * f ;";*/
        
            "E' -> E;" +
            "E -> E + T | T ;" +
            "T -> T * F | F ;" +
            "F -> ( E ) | num ;";
        
        boolean pasoLexico = gramaticaDeGramaticaLR0.analisisLexico(cadena);
        if(pasoLexico){
            System.out.println("\nEl Analisis Léxico fue correcto\n");
            boolean pasoSintactico = gramaticaDeGramaticaLR0.analisisSintactico(cadena, gramatica);
            if(pasoSintactico){
                System.out.println("Análisis Sintáctico Correcto");
                gramaticaDeGramaticaLR0.algoritmoLR1(gramatica);
                //String expresion = "( num + num ) * num - num $";
                //String expresion = "( SIMB OR ( SIMB & SIMB ) + ) ? OR SIMB $";
                //boolean cadenaValida = gramaticaDeGramaticaLL1.analizarCadenaLL1(expresion);
                //if(cadenaValida)
                //   System.out.println("Cadena Aceptada");
                //else
                //   System.out.println("ERROR cadena NO aceptada");
                //if(cadenaValida)
                //    System.out.println("Cadena Aceptada");
                //else
                //    System.out.println("ERROR cadena NO aceptada");
            }else
                System.out.println("ERROR SINTACTICO");
        }else
            System.out.println("ERROR Léxico");
    }
}
