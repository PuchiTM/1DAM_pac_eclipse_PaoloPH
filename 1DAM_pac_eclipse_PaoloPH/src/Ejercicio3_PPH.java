import java.util.*;

public class Ejercicio3_PPH {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String sexo = "";
		double IMC = 0;

		double velocidad = 0;
		double velocidadMedia = 0;

		double distancia = 0;
		double distanciaMedia = 0;
		double distanciaMaxima = Integer.MIN_VALUE;

		double caloriasQuemadas = 0;
		double caloriasQuemadasMedia = 0;
		double caloriasQuemadasMaxima = Integer.MIN_VALUE;

		System.out.println("Introduce su nombre:");
		String nombre = sc.nextLine();

		System.out.println("Introduce su edad:");
		int edad = sc.nextInt();

		System.out.println("Introduce su peso (en KG):");
		double peso = sc.nextDouble();

		System.out.println("Introduce su altura (en M):");
		double altura = sc.nextDouble();

		System.out.println("Introduce su sexo (1-M, 2-F, Cualquier otro valor-Prefiero no decirlo):");
		int eleccionSexo = sc.nextInt();

		switch (eleccionSexo) {
		case 1:
			sexo = "M";
			break;

		case 2:
			sexo = "F";
			break;

		default:
			sexo = "-";
			break;
		}

		System.out.println("Introduce su velocidad inicial (en km/h):");
		double velocidadInicial = sc.nextDouble();

		System.out.println("Introduce su distancia inicial (en km):");
		double distanciaInicial = sc.nextDouble();

		System.out.println("Introduce las calorías quemadas iniciales (en kcal):");
		double caloriasQuemadasIniciales = sc.nextDouble();

		IMC = peso / (altura * altura);

		System.out.println("Introduce el número de sesiones que quieres hacer:");
		int numeroSesiones = sc.nextInt();

		for (int i = 0; i < numeroSesiones; i++) {
			System.out.println("Introduce la velocidad de la sesión " + (i + 1));
			velocidad = sc.nextDouble();

			velocidadMedia += velocidad;

			System.out.println("Introduce la distancia de la sesión " + (i + 1));
			distancia = sc.nextDouble();

			if (distancia > distanciaMaxima) {
				distanciaMaxima = distancia;
			}

			distanciaMedia += distancia;

			System.out.println("Introduce las calorías quemadas de la sesión " + (i + 1));
			caloriasQuemadas = sc.nextDouble();

			if (caloriasQuemadas > caloriasQuemadasMaxima) {
				caloriasQuemadasMaxima = caloriasQuemadas;
			}

			caloriasQuemadasMedia += caloriasQuemadas;
		}

		velocidadMedia = velocidadMedia / numeroSesiones;
		distanciaMedia = distanciaMedia / numeroSesiones;
		caloriasQuemadasMedia = caloriasQuemadasMedia / numeroSesiones;

		ticket(nombre, edad, peso, altura, sexo, IMC, numeroSesiones, velocidadMedia, distanciaMedia,
				caloriasQuemadasMedia, distanciaMaxima, caloriasQuemadasMaxima, velocidadInicial, distanciaInicial,
				caloriasQuemadasIniciales);

	}

	public static void ticket(String nombre, int edad, double peso, double altura, String sexo, double indiceMC,
			int numeroSesiones, double velocidadMedia, double distanciaMedia, double caloriasQuemadasMedia,
			double distanciaMaxima, double caloriasQuemadasMaxima, double velocidadInicial, double distanciaInicial,
			double caloriasQuemadasIniciales) {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Hola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:\n\n");
		System.out.println("Edad: " + edad);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura + " m");
		System.out.println("Sexo: " + sexo);

		System.out.println("Índice de masa corporal: " + indiceMC + "\n\n");
		System.out.println("La media del entrenamiento en " + numeroSesiones + " sesiones es:\n");
		System.out.println("Velocidad: " + velocidadMedia);
		System.out.println("Distancia recorrida " + distanciaMedia);
		System.out.println("Calorías quemadas: " + caloriasQuemadasMedia);
		System.out.println("Máxima distancia recorrida: " + distanciaMaxima);
		System.out.println("Máximo número de calorías quemadas en una sesión: " + caloriasQuemadasMaxima);
		System.out.println("---------------------------------------------------------------------------------");
		if(velocidadInicial < velocidadMedia) {
			System.out.println("Enhorabuena! Tu velocidad media es mayor que la inicial");
			System.out.println("---------------------------------------------------------------------------------");
		}
		
		if(distanciaInicial < distanciaMedia) {
			System.out.println("Enhorabuena! Tu distancia media es mayor que la inicial");
			System.out.println("---------------------------------------------------------------------------------");
		}
		
		if(caloriasQuemadasIniciales < caloriasQuemadasMedia) {
			System.out.println("Enhorabuena! Tu media de calorías quemadas es mayor que las iniciales");
			System.out.println("---------------------------------------------------------------------------------");
		}

	}

}
