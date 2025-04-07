import java.util.*;

public class Ejercicio2_PPH {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int almacenamientoNominaAnterior = 0;

		boolean apto = procesoSeleccion();

		if (apto == false) {
			System.out.println("Se ha quedado fuera del proceso de selecci�n.");
		}

		else {

			for (int i = 0; i < 4; i++) {
				System.out.println("Introduce el valor de su n�mina anterior n�mero " + (i + 1) + "(lleva "
						+ almacenamientoNominaAnterior + "�):");
				double almacenamientoDouble = sc.nextDouble();
				almacenamientoNominaAnterior += almacenamientoDouble;
			}

			double mediaNomina = almacenamientoNominaAnterior / 5;

			if (mediaNomina > 2500) {
				System.out.println("Se le subuir� el sueldo un 5%...");
				System.out.println("Pasar� de cobrar " + mediaNomina + " a " + (mediaNomina + (mediaNomina * 0.05)));
			}

			else {
				System.out.println("Se le subuir� el sueldo un 10%...");
				System.out.println("Pasar� de cobrar " + mediaNomina + " a " + (mediaNomina + (mediaNomina * 0.1)));
			}

		}
	}

	public static boolean procesoSeleccion() {

		System.out.println("Introduce su edad:");
		int edad = sc.nextInt();

		if (edad > 40) {
			return false;
		}

		System.out.println("Introduce su nombre:");
		String nombre = sc.nextLine();
		nombre = sc.nextLine();

		System.out.println("Introduce sus a�os trabajados:");
		int anhosTrabajados = sc.nextInt();

		System.out.println("Introduce su sueldo bruto anual anterior:");
		double sueldoBruto = sc.nextDouble();

		if (sueldoBruto > 30000) {
			return false;
		}

		System.out.println("Est� contratado, " + nombre + ", con " + anhosTrabajados + " a�os de experiencia.");
		return true;

	}

}
