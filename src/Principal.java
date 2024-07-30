import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		Scanner lectura = null;

		String marca;
		String tipo;
		String color;
		float precio;

		Ropa ropa;

		int menuPrin, subMenu;

		// Instancia de Clase
		Implementacion imp = new Implementacion();

		do {
			System.out.println("Bienvenidos al sistema");
			System.out.println("1--Agregar");
			System.out.println("2--Mostrar");
			System.out.println("3--Buscar");
			System.out.println("4--Editar");
			System.out.println("5--Eliminar");
			System.out.println("6--Salir");

			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1:

				System.out.println("Ingrese la marca");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				System.out.println("Ingrese el tipo");
				lectura = new Scanner(System.in);
				tipo = lectura.nextLine();

				System.out.println("Ingrese el color");
				lectura = new Scanner(System.in);
				color = lectura.nextLine();

				System.out.println("Ingrese el precio");
				lectura = new Scanner(System.in);
				precio = lectura.nextFloat();

				// Creamos el objeto con el constructor con parametros
				ropa = new Ropa(marca, tipo, color, precio);

				// Guardar
				imp.guardar(ropa);
				System.out.println("Se guardo");
				break;
			case 2:
				imp.mostrar();
				break;
			case 3:
				System.out.println("Ingrese la marca a buscar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				// Buscar
				// Declarar el objeto con el constructor que lleva la llave marca
				Ropa rop = new Ropa(marca);
				ropa=imp.buscar(rop);
				System.out.println("Se encontro " + ropa);
				break;
			case 4:
				System.out.println("Ingrese la marca a editar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				// Buscar
				// Declarar el objeto con el constructor que lleva la llave marca
				Ropa ropa2 = new Ropa(marca);
				ropa = imp.buscar(ropa2);
				System.out.println("Se encontro " + ropa.getMarca() + " a editar");

				// color, precio
				do {
					System.out.println("MENU PARA EDITAR");
					System.out.println("1--Color");
					System.out.println("2--Precio");
					System.out.println("3--Regresar");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					switch (subMenu) {
					case 1:
						System.out.println("Ingresa el nuevo color");
						lectura = new Scanner(System.in);
						color = lectura.nextLine();

						// Actualizacion
						ropa.setColor(color);
						imp.editar(ropa);
						System.out.println("Se edito");
						break;
					case 2:
						System.out.println("Ingrese el nuevo precio");
						lectura = new Scanner(System.in);
						precio = lectura.nextInt();
						
						//Actualizacion
						ropa.setPrecio(precio);
						imp.editar(ropa);
						System.out.println("Se edito");
						break;
					case 3:
						break;
					}
				} while (subMenu < 3);
				break;
			case 5:
				System.out.println("Ingrese la marca a eliminar");
				lectura = new Scanner(System.in);
				marca = lectura.nextLine();

				// Eliminar
				imp.eliminar(marca);
				System.out.println("Se elimino");
				break;
			case 6:
				break;
			}
		} while (menuPrin < 6);
	}

}
