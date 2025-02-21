import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa una palabra en minúsculas: ");
        String palabra = scanner.nextLine();

        int vocales = 0, consonantes = 0;

        
        String vocalesLista = "aeiou";

        
        for (char c : palabra.toCharArray()) {
            if (vocalesLista.indexOf(c) != -1) {
                vocales++;
            } else if (Character.isLetter(c)) {
                consonantes++;
            }
        }

        
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }
}
