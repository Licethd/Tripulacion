package Factories;

import org.junit.Assert;
import org.junit.Test;

public class CargoFactory_Test {

	@Test
	public void constructor_accept() {
		Assert.assertNotNull(new CargoFactory());
	}

	@Test
	public void create_accept() {
		Assert.assertNotNull(new CargoFactory().Create("GRUPO-A"));
	}
}
