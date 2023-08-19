package Model.Tripulante.ValueObjects;

// import core.BussinessRule;
import core.ValueObject;

public class HorasVuelo extends ValueObject {

	public Integer Value;

	public HorasVuelo(Integer value) throws Exception {
		if (value <= 0) {
			throw new Exception("La cantidad no puede ser negativa ");
		}
		Value = value;
	}

	public Integer getValue() {
		return Value;
	}
}
