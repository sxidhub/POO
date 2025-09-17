import java.util.Scanner;

public class Triangulo_Pascual_Gemini {

    public static void main(String[] args) {
        System.out.println("¿Cuántas filas quieres en tu triángulo de Pascal?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println();

        // Bucle externo para las filas (desde 0 hasta n-1)
        for (int i = 0; i < n; i++) {
            int numero = 1; // El primer número en cada fila siempre es 1

            // Bucle interno para los elementos de cada fila (desde 0 hasta i)
            for (int j = 0; j <= i; j++) {
                System.out.print(numero + " ");
                // La fórmula para el siguiente elemento de la fila
                // C(n, k) = C(n, k-1) * (n - k + 1) / k
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println(); // Salto de línea para la siguiente fila
        }
    }
}