package Model.Tripulante.ValueObjects;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class HorasVuelo_Test {

	// @Test
	// public void HorasVueloCorrecto() throws Exception {
	// Integer valorEsperado = 100;
	// HorasVuelo valor = new HorasVuelo(valorEsperado);
	// Assert.assertEquals(valorEsperado, valor.getValue());
	// }

	@ParameterizedTest
	@ValueSource(ints = { 100, 500, 658 })

	public void HorasVueloCorrecto(Integer valorEsperado) throws Exception {
		HorasVuelo valor = new HorasVuelo(valorEsperado);
		Assert.assertEquals(valorEsperado, valor.getValue());
	}

}
