/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALFM
 */

public class BinaryText {

    BinaryDecimal binaryDecimalConverter = new BinaryDecimal();
    
    public String binaryToText(String binaryText) {
        // Necesitamos separar cada número binario por espacio. Usamos split
        String[] binaryNumbers = binaryText.split(" ");
        String text = "";

        // Los recorremos. En cada paso tenemos al número binario
        for (String currentBinary : binaryNumbers) {
            // Ahora convertimos ese binario a decimal
            int decimal = binaryDecimalConverter.binaryToDecimal(currentBinary);
            // Obtenemos la letra que le corresponde a ese valor ASCII
            char letra = (char) decimal;
            text += letra;
        }
        return text;
    }

    public String textToBinary(String originalText) {
        String binaryText = "";
        for (int i = 0; i < originalText.length(); i++) {
            // Primero obtenemos la letra o carácter actual
            char currentChar = originalText.charAt(i);
            // Necesitamos obtener su representación entera ASCII
            int ascii = (int) currentChar;
            // Una vez que ya tenemos el entero, lo convertimos a binario
            String binary = binaryDecimalConverter.decimalToBinary(ascii);
            // Lo agregamos a la cadena resultante agregando además un espacio
            binaryText += binary + " ";
        }
        // Finalmente regresamos el texto
        return binaryText;
    }


}