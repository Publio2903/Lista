/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ALFM
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        
        List<String> lista = new ArrayList();
        lista.add("Maria");
        lista.add("vidal");
        lista.add("Yenny");
        lista.add("Cindy");
        lista.add("Juliana");
        lista.add("Sebas");
        
        for(int i = 0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        

    }
    
}
