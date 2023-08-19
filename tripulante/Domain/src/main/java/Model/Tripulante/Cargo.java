package Model.Tripulante;

import core.Entity;
import java.util.UUID;

public class Cargo extends Entity<UUID> {


	private String Descripcion;
	private Double sueldo;


	public Cargo() {}

	public Cargo(String descripcion) {
		key = UUID.randomUUID();
		this.Descripcion = descripcion;
	}

	public UUID getKeyCargo() {
		return key;
	}

	public void setKeyCargo(UUID key) {
		this.key = key;
	}


	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

}
