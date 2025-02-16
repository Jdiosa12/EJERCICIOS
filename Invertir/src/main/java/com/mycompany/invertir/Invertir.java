
package com.mycompany.invertir;


public class Invertir {

    public static void main(String[] args) {
        
        String str = "Hola Mundo";
        
        System.out.println(reverse(str));
       
    }
    
    public static String reverse(String text){
        if(text == null){
            
            throw new IllegalArgumentException("el texto no puede ser nulo.");
        }
        StringBuilder textOut = new StringBuilder();
        char[] chars = text.toCharArray();
        for(int i = chars.length -1; i >= 0; i--){
            textOut.append(chars[i]);
            
            
        }
        return textOut.toString();
    }
    
}
