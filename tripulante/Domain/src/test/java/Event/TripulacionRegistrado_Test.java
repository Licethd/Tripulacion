package Event;

import Model.Tripulacion.Tripulacion;
import org.junit.Assert;
import org.junit.Test;

public class TripulacionRegistrado_Test {

	@Test
	public void Constructor_accept() {
		Tripulacion a = new Tripulacion();
		Assert.assertNotNull(
			new TripulacionRegistrado(a.key, a.getDescripcion(), a.Tripulantes)
		);
	}

	@Test
	public void ConstructorGetSet_accept() {
		Tripulacion a = new Tripulacion("GRUPO");
		TripulacionRegistrado c = new TripulacionRegistrado(
			a.key,
			a.getDescripcion(),
			a.getTripulantes()
		);
		c.setNombre(a.getDescripcion());
		c.setTripulantes(null);

		Assert.assertEquals("GRUPO", c.getNombre());
	}
}
