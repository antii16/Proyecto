package ficha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ficha_alumno {
	
public static List<String> a�adir_alumno(String nombre, String apellidos, String telefono, String email, String direccion) {
		
		List<String> alumnos = new ArrayList<String>();
		
		alumnos.add(nombre);	
		alumnos.add(apellidos);
		alumnos.add(telefono);	
		alumnos.add(email);
		alumnos.add(direccion);
			
			
		return alumnos;			
		
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int opcion;
		List<String> resultado;
			
		System.out.println("1. A�adir alumno");
		System.out.println("2. Salir\n");
		System.out.println("Selecciona la opcion deseada: ");
		opcion = teclado.nextInt();
			
		
		
		switch(opcion) {
		case 1:
			System.out.println("A�ade un nuevo alumno");
			System.out.println("-------------\n ");
			
			System.out.println("Nombre: ");
			String nombre = teclado.next();
			
			System.out.println("Apellidos: ");
			String apellidos  = teclado.next();
			
			System.out.println("Tel�fono: ");
			String telefono  = teclado.next();
			
			System.out.println("Email: ");
			String email  = teclado.next();
			
			System.out.println("Direccion: ");
			String direccion  = teclado.next();
			
			resultado = a�adir_alumno(nombre, apellidos, telefono, email, direccion);
			System.out.println("A�adido nuevo alumno:\n" + resultado);
			
			
			
		case 2:
			System.out.println("SALIR");
			System.exit(0);
			teclado.close();
			break;				
			
		}
			
	 }
			
 }



