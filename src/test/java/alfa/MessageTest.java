package alfa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.alfa.Message;

import junit.framework.TestCase;

public class MessageTest extends TestCase {

	@Test
	public void test() {
	  
		Message msg = new Message();
				
		String valorEsperado  = "Deu certo";
		String valorRetornado = msg.getMessage();
		
		assertEquals(valorEsperado, valorRetornado);
		
		
		
		
	}

}
