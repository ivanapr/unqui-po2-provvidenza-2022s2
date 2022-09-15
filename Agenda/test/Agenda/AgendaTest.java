package Agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTest {

	Agenda a;
	
	@BeforeEach
	void setUp() throws Exception {
		a.agregarElemento("Jose");
		a.agregarElemento("Asfdsg");
		a.agregarElemento("Jules");
		a.agregarElemento("Vasf");
	}
	@Test
	void test() {
		assertTrue(a.nombreEmpiezaCon("Jose", "J"));
	}

}
