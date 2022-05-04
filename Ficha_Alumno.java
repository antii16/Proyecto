package ficha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Antonella
 * @version 2.0
 */
public class Ficha_alumno {
	
	/** 
	 * @param nombre Es el nombre del alumno
	 * @param apellidos Son los apellidos del alumno
	 * @param telefono Es el numero de telefono del alumno
	 * @param email Es el email del alumno
	 * @param direccion Es la dirección del alumno
	 * @return Devuelve una lista con los datos de un alumno
	 */
	
public static List<String> añadir_alumno(String nombre, String apellidos, String telefono, String email, String direccion) {
		
		List<String> alumnos = new ArrayList<String>();
		
		alumnos.add(nombre);	
		alumnos.add(apellidos);
		alumnos.add(telefono);	
		alumnos.add(email);
		alumnos.add(direccion);
			
			
		return alumnos;			
		
	}
	
/**
 * @param args Entrada principal a la aplicación
 */
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int opcion; 
		List<String> resultado;
			
		System.out.println("1. Añadir alumno");
		System.out.println("2. Salir\n");
		System.out.println("Selecciona la opcion deseada: ");
		opcion = teclado.nextInt();
			
		
		
		switch(opcion) {
		case 1:
			System.out.println("Añade un nuevo alumno");
			System.out.println("-------------\n ");
			
			System.out.println("Nombre: ");
			String nombre = teclado.next();
			
			System.out.println("Apellidos: ");
			String apellidos  = teclado.next();
			
			System.out.println("Teléfono: ");
			String telefono  = teclado.next();
			
			System.out.println("Email: ");
			String email  = teclado.next();
			
			System.out.println("Direccion: ");
			String direccion  = teclado.next();
			
			resultado = añadir_alumno(nombre, apellidos, telefono, email, direccion); // llamada a la funcion
			System.out.println("Añadido nuevo alumno:\n" + resultado);
			
			
			
		case 2: 
			System.out.println("SALIR");
			System.exit(0);
			teclado.close();
			break;				
			
		}
			
	 }
			
 }



