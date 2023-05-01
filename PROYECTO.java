import java.io.*;

public class PROYECTO {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String cantidad;
		int cas;
		String categoria;
		String contrasena;
		
		int des;
		int elec;
		String name;
		String nit;
		String nom;
		String nombre;
		int opc;
		int p;
		String password;
		String precio;
		String prod;
		String producto;
		String roll;
		String ropaunisex[][];
		String tot;
		int u;
		String username[][];
		username = new String[10][3];
		username[0][0] = "Daniel";
		username[0][1] = "Contra";
		username[0][2] = "Administrador";
		username[1][0] = "Colega";
		username[1][1] = "Persona";
		username[1][2] = "Trabajador";
		username[2][0] = "Alejandro";
		username[2][1] = "co-worker";
		username[2][2] = "Trabajadores";
		ropaunisex = new String[25][4];
		ropaunisex[0][0] = "camiseta de cuello";
		ropaunisex[0][1] = "Hombre";
		ropaunisex[0][2] = "$65.99";
		ropaunisex[0][3] = "15";
		ropaunisex[1][0] = "Levís de lona";
		ropaunisex[1][1] = "Hombre";
		ropaunisex[1][2] = "$50.99";
		ropaunisex[1][3] = "15";
		ropaunisex[2][0] = "Vestido Ablusado";
		ropaunisex[2][1] = "Mujer";
		ropaunisex[2][2] = "$30";
		ropaunisex[2][3] = "10";
		ropaunisex[3][0] = "Faldas de pliegues";
		ropaunisex[3][1] = "Mujer";
		ropaunisex[3][2] = "$30";
		ropaunisex[3][3] = "10";
		ropaunisex[4][0] = "camisolas";
		ropaunisex[4][1] = "Niño";
		ropaunisex[4][2] = "$12";
		ropaunisex[4][3] = "11";
		ropaunisex[5][0] = "Chumpas de niños";
		ropaunisex[5][1] = "Niño";
		ropaunisex[5][2] = "$12";
		ropaunisex[5][3] = "11";
		ropaunisex[6][0] = "Camisa o blusa a rayas.";
		ropaunisex[6][1] = "Niña";
		ropaunisex[6][2] = "$8";
		ropaunisex[6][3] = "6";
		ropaunisex[7][0] = "Chaqueta de niña";
		ropaunisex[7][1] = "Niña";
		ropaunisex[7][2] = "$8";
		ropaunisex[7][3] = "6";
		ropaunisex[8][0] = "Gorra fox";
		ropaunisex[8][1] = "Accesorios Variados";
		ropaunisex[8][2] = "$7";
		ropaunisex[8][3] = "5";
		ropaunisex[9][0] = "lentes oscuros";
		ropaunisex[9][1] = "Accesorios Variados";
		ropaunisex[9][2] = "$3";
		ropaunisex[9][3] = "2";
		System.out.println("//Bienvenido a almacén de ropa//");
		System.out.println("Que deseas Ingresar como: ");
		System.out.println(" 1. Administrador");
		System.out.println(" 2. Trabajador");
		elec = Integer.parseInt(bufEntrada.readLine());
		if (elec==1) {
			System.out.println("Ingresa tu nombre");
			nombre = bufEntrada.readLine();
			System.out.println("Ingresa tu contraseña");
			contrasena = bufEntrada.readLine();
			System.out.println("Bienvenido a almacén de ropa");
			System.out.println("______¿Que deseas pedir con el Administrador______?");
			System.out.println("--------MENU--------");
			System.out.println(" 1. Registrar un nuevo Empleado ");
			System.out.println(" 2. Gestionar Productos         ");
			System.out.println(" 3. Ver Stock del Almacen       ");
			System.out.println(" 4. Crear una Factura           ");
			System.out.println(" 5. Salir                       ");
			opc = Integer.parseInt(bufEntrada.readLine());
			switch (opc) {
			case 1:
				System.out.println("//*Ingrese el nombre del nuevo trabajador*//");
				name = bufEntrada.readLine();
				System.out.println("Ingrese una contraseña");
				password = bufEntrada.readLine();
				System.out.println("//¿Que cargo tendra el trabajador? Administrador/Trabajador//");
				roll = bufEntrada.readLine();
				username[3][0] = name;
				username[3][1] = password;
				username[3][2] = roll;
				System.out.println("//*Se ha registrado con exito al nuevo trabajador*//");
				System.out.println("Empleados actuales");
				for (u=1;u<=10;u++) {
					System.out.println("Nombre/Usuario: "+username[u-1][0]+"Contraseña: "+username[u-1][1]+"Cargo: "+username[u-1][2]);
				}
				break;
			case 2:
				System.out.println(".....MENU PRODUCTOS DE VeronicaS Shopping...... ");
				System.out.println(" 1. Agregar un producto segun su Categoria ");
				System.out.println(" 2. Mostrar Lista de Productos             ");
				System.out.println(" 3. Salir                                  ");
				des = Integer.parseInt(bufEntrada.readLine());
				switch (des) {
				case 1:
					System.out.println("//Ingrese el nombre del Producto por favor//");
					producto = bufEntrada.readLine();
					System.out.println("Ingrese la categoria del Producto para Hombre/Mujer/Niño/Niña/Accesorios Variados");
					categoria = bufEntrada.readLine();
					System.out.println("Ingrese el precio del producto porfavor");
					precio = bufEntrada.readLine();
					System.out.println("Ingrese la cantidad de producto porfavor");
					cantidad = bufEntrada.readLine();
					ropaunisex[10][0] = producto;
					ropaunisex[10][1] = categoria;
					ropaunisex[10][2] = precio;
					ropaunisex[10][3] = cantidad;
					for (p=1;p<=25;p++) {
						System.out.println("Producto: "+ropaunisex[p-1][0]+" Categoria: "+ropaunisex[p-1][0]+" Precio: "+ropaunisex[p-1][2]+" Cantidad: "+ropaunisex[p-1][3]);
					}
					break;
				case 2:
					System.out.println("Lista de Productos Veronicas Shopping");
					for (p=1;p<=25;p++) {
						System.out.println("Producto: "+ropaunisex[p-1][0]+" Categoria: "+ropaunisex[p-1][0]+" Precio: "+ropaunisex[p-1][2]+" Cantidad: "+ropaunisex[p-1][3]);
					}
					break;
				case 3:
					break;
				default:
					System.out.println("Salir del programa");
				}
				break;
			case 3:
				System.out.println("productos de Stock");
				for (p=1;p<=25;p++) {
					System.out.println("Producto: "+ropaunisex[p-1][0]+" Categoria: "+ropaunisex[p-1][0]+" Precio: "+ropaunisex[p-1][2]+" Cantidad: "+ropaunisex[p-1][3]);
				}
				break;
			case 4:
				System.out.println("...........Factura.........");
				System.out.println("! Nombre Completo del usuario !");
				nom = bufEntrada.readLine();
				System.out.println("! Numero de Nit               !");
				nit = bufEntrada.readLine();
				System.out.println("! Detalles del Producto       !");
				prod = bufEntrada.readLine();
				System.out.println("! Total                       !");
				tot = bufEntrada.readLine();
				break;
			case 5:
				break;
			default:
				System.out.println("salir del programa");
			}
		}
		if (elec==2) {
			System.out.println("Ingresa tu nombre");
			nombre = bufEntrada.readLine();
			System.out.println("Ingresa tu contraseña");
			contrasena = bufEntrada.readLine();
			System.out.println("______Bienvenido a almacén de ropa_____");
			System.out.println("--------¿Que deseas pedir con el Administrador--------");
			System.out.println("................MENU................");
			System.out.println(" 1. Ver Stock del Almacen       ");
			System.out.println(" 2. Crear una Factura           ");
			System.out.println(" 3. Salir                       ");
			cas = Integer.parseInt(bufEntrada.readLine());
			switch (cas) {
			case 1:
				System.out.println("Lista de Productos Veronicas Shopping");
				for (p=1;p<=25;p++) {
					System.out.println("Producto: "+ropaunisex[p-1][0]+" Categoria: "+ropaunisex[p-1][0]+" Precio: "+ropaunisex[p-1][2]+" Cantidad: "+ropaunisex[p-1][3]);
				}
				break;
			case 2:
				System.out.println("...........Factura.........");
				System.out.println("! Nombre Completo del usuario !");
				nom = bufEntrada.readLine();
				System.out.println("! Numero de Nit               !");
				nit = bufEntrada.readLine();
				System.out.println("! Detalles del Producto       !");
				prod = bufEntrada.readLine();
				System.out.println("! Total                       !");
				tot = bufEntrada.readLine();
				break;
			case 3:
				break;
			default:
				System.out.println("salir del programar");
			}
		}
	}


}