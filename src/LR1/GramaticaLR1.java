/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR1;

import GramaticaDeGramaticas.Gramatica;
import GramaticaDeGramaticas.GramaticaDeGramaticas;

/**
 *
 * @author xXEdG
 */
public class GramaticaLR1 extends GramaticaDeGramaticas{
    private LR1 lr;
    
    public GramaticaLR1(Gramatica gramatica) {
        super(gramatica);
    }
    
    public void algoritmoLR1(Gramatica gramatica){
        System.out.println("************* REGLAS ***************");
        gramatica.imprimirReglas();
        System.out.println("************* SIMBOLOS *************");
        gramatica.imprimirSimbolos();
        lr = new LR1(gramatica);
        System.out.println(lr);
        lr.imprimirTablaLR1();
    }
    
    public boolean analizarCadenaLR1(String expresion){
        if(lr != null)
            return lr.evaluarExpresion(expresion);
        else 
            return false;
    }
}