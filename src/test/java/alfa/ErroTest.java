package alfa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.alfa.Message;

import junit.framework.TestCase;

public class ErroTest extends TestCase {

	@Test
	public void test() {
	  
		Erro msg = new Erro();
				
		String valorEsperado  = "Deu certo";
		String valorRetornado = msg.getMessage();
		
		assertEquals(valorEsperado, valorRetornado);
		
	}

}
