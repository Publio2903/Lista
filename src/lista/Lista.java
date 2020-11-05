/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList();
        //bucle infinito While(), se repite el bucle hasta que presione el numero "2"
        while(true){
            //menu de opciones
            System.out.println("[1] Ingresar nombre a la lista.");
            System.out.println("[2] Finalizar");
            int a = scanner.nextInt();
            //si elige 1 - agregar nombres a la lista
            if (a == 1){
                System.out.println("Ingrese nombre: ");
                String name =  scanner.next();
                lista.add(name);
            }else if( a == 2){// si elige 2 - termina el procesos y visualiza la lista.
                System.out.println("Proceso terminado, nombres en la lista: ");
                for(int i = 0; i<lista.size(); i++){
                    System.out.println(lista.get(i));
                }
                //sale del while infinito y termina la ejecuciÃ³n del programa
                break;
            }
        }
    }    
}
    /*{
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
        

    }*/
    
//}
