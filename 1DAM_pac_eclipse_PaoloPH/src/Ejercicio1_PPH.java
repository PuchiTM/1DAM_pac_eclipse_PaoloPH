import java.util.*;

public class Ejercicio1_PPH {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double salarioJefe = 0;
		double salarioEncargado = 0;
		double salarioOficinistas = 0;
		int numeroOficinistas = 0;
		boolean proyectosTerminados = false;
		int eleccionProyectos = 0;
		double presupuestoEmpresa = 0;

		System.out.println("Introduzca el salario del Jefe:");
		salarioJefe = sc.nextDouble();

		System.out.println("Introduzca el salario del encargado:");
		salarioEncargado = sc.nextDouble();

		System.out.println("Introduzca el salario de los oficinistas:");
		salarioOficinistas = sc.nextDouble();

		System.out.println("Introduzca el número de oficinistas:");
		numeroOficinistas = sc.nextInt();

		System.out.println("Introduzca si ha terminado los proyectos (1-Si, 2-No):");
		eleccionProyectos = sc.nextInt();

		switch (eleccionProyectos) {
		case 1:
			proyectosTerminados = true;
			break;

		case 2:
			proyectosTerminados = false;
			break;

		default:
			System.out.println("Has introducido un entero fuera de rango, lo tomaremos como un NO");
			proyectosTerminados = false;
			break;
		}

		System.out.println("Finalmente, introduce el presupuesto de la empresa:");
		presupuestoEmpresa = sc.nextDouble();

		System.out.println("Se calcularán todos los datos...");

		boolean apto = auditoriaEmpresa(proyectosTerminados, salarioJefe, salarioEncargado, salarioOficinistas,
				numeroOficinistas, presupuestoEmpresa);

		if (apto == true) {
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
		}

	}

	public static boolean auditoriaEmpresa(boolean proyectosTerminados, double salarioJefe, double salarioEncargado,
			double salarioOficinistas, int numeroOficinistas, double presupuestoEmpresa) {

		double gastoAcumulado = 0;

		if (proyectosTerminados == false) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
			return false;
		}

		else {
			gastoAcumulado = salarioJefe + salarioEncargado + (salarioOficinistas * numeroOficinistas);

			if (gastoAcumulado > 20000) {
				System.out.println(
						" No ha pasado la auditoría ya que el gasto en personal es de ... y excede el límite mensual de 20.000 euros");
				return false;
			}

			else {
				if (presupuestoEmpresa > 100000) {
					System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "
							+ presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
					return false;
				}

				else {
					return true;
				}
			}
		}

	}

}
