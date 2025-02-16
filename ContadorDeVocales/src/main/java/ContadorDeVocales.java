import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la palabra al usuario
        System.out.print("Ingresa una palabra en minúsculas: ");
        String palabra = scanner.nextLine();

        int vocales = 0, consonantes = 0;

        // Definir las vocales
        String vocalesLista = "aeiou";

        // Recorrer la palabra caracter por caracter
        for (char c : palabra.toCharArray()) {
            if (vocalesLista.indexOf(c) != -1) {
                vocales++;
            } else if (Character.isLetter(c)) {
                consonantes++;
            }
        }

        // Mostrar el resultado
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }
}
