import java.util.Scanner;
import java.util.Random;

public class Ejercicio4_PPH {

    public static void main(String[] args) {
        final int NUM_EQUIPOS = 20;
        String[] arrayNombres = new String[NUM_EQUIPOS];
        int[] arrayPuntuacion = new int[NUM_EQUIPOS];

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < NUM_EQUIPOS; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = entrada.nextLine();
        }

        for (int i = 0; i < NUM_EQUIPOS; i++) {
            arrayPuntuacion[i] = 35 + random.nextInt(66);
        }

        
        int maxPuntos = arrayPuntuacion[0];
        int minPuntos = arrayPuntuacion[0];
        int indexGanador = 0;
        int indexPerdedor = 0;
        int sumaTotal = arrayPuntuacion[0];

        for (int i = 1; i < NUM_EQUIPOS; i++) {
            int puntos = arrayPuntuacion[i];
            sumaTotal += puntos;

            if (puntos > maxPuntos) {
                maxPuntos = puntos;
                indexGanador = i;
            }

            if (puntos < minPuntos) {
                minPuntos = puntos;
                indexPerdedor = i;
            }
        }

        double media = (double) sumaTotal / NUM_EQUIPOS;

        System.out.println("\n--- RESULTADOS DE LA LIGA ---");
        System.out.println("Equipo ganador: " + arrayNombres[indexGanador] + " con " + maxPuntos + " puntos.");
        System.out.println("Último clasificado: " + arrayNombres[indexPerdedor] + " con " + minPuntos + " puntos.");
        System.out.printf("Puntuación media de los equipos: %.2f puntos.\n", media);

        entrada.close();
    }
}