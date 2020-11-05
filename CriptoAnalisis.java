/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package criptoanalisis;

import javax.swing.JOptionPane;
/**
 *
 * @author ALFM
 */
public class CriptoAnalisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryText binaryTextConverter = new BinaryText();
        String[] buttons = {"binario a Texto", "texto a binario"};
        
        String originalText = "parzibyte.me";
        String translatedText = binaryTextConverter.textToBinary(originalText);
       
        String binaryText = "1110000 1100001 1110010 1111010 1101001 1100010 1111001 1110100 1100101 101110 1101101 1100101";
        String translatedBinary = binaryTextConverter.binaryToText(binaryText);

        System.out.println("-----------------");
        System.out.println(binaryText);
        System.out.println("Convertido a texto es:" + translatedBinary);
        int option = JOptionPane.showOptionDialog(null, 
                    originalText + " = " + translatedText + "\n\nElija una opción",
                    "Conversor Texto / binario", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[0]);

        if (option == 0){
            String binary = JOptionPane.showInputDialog("Ingrese código binario: ");
            String ascciDecode = binaryTextConverter.binaryToText(binary);
            System.out.println("El código: " + binary + "\nen ascci es: " + ascciDecode);
            JOptionPane.showMessageDialog(null, "El mensaje decodificado es: \n" + ascciDecode,
                    "Mensaje Decodificado", 1);
        }else if (option == 1){
            String ascci = JOptionPane.showInputDialog("Ingrese texto: ");
            String binaryEncode = binaryTextConverter.textToBinary(ascci);
            System.out.println("El texto: " + ascci + "\nen binario es: " + binaryEncode);
            JOptionPane.showMessageDialog(null, "El mensaje codificado es: \n" + binaryEncode,
                    "Mensaje Codificado", 1);
        }
    }
}