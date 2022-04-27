package ficha;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class Ficha_AlumnoTest {
	private List<String> esperado = new ArrayList<String>();

		
	@Before
	public void inicializa() {
		esperado.add("Antonella");	
		esperado.add("Racconto");
		esperado.add("666666999");	
		esperado.add("prueba@hotmail.com");
		esperado.add("C/ Gran Vía nº34");	
		
		}
		
	@Test
	public void test_correcto() {
		List<String> resultado = Ficha_alumno.añadir_alumno("Antonella","Racconto", "666666999","prueba@hotmail.com","C/ Gran Vía nº34");
		inicializa();
		System.out.println(esperado);
		assertEquals(esperado, resultado);
		
		}	
	
	@Test
	public void test_incorrecto() {
			
		List<String> esperado = new ArrayList<String>();
		
		esperado.add("Juana");	
		esperado.add("Racconto");
		esperado.add("666666999");	
		esperado.add("prueba@hotmail.com");
		esperado.add("C/ Gran Vía nº34");
		
		List<String> resultado = Ficha_alumno.añadir_alumno("Antonella","Racconto", "666666999","prueba@hotmail.com","C/ Gran Vía nº34");
		assertEquals(esperado, resultado);	
			
	}
}

