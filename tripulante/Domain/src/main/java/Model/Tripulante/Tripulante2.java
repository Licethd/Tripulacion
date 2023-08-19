package Model.Tripulante;

import Event.PersonalRegistrado;
import Model.Tripulante.ValueObjects.HorasVuelo;
import core.AggregateRoot;
import java.util.UUID;

public class Tripulante2 extends AggregateRoot<UUID> {

	// public UUID Key;
	private String Nombre;
	private String Apellido;
	private String EmailAddress;
	private Integer Estado;
	private String Tipo;
	private HorasVuelo HorasVuelo;
	private Double NroMillas;

	UUID KeyCargo;

	public Tripulante2() {}

	public Tripulante2(
		String nombre,
		String apellido,
		String emailAddress,
		String tipo,
		HorasVuelo horasVuelo,
		Double nroMillas,
		UUID keyCargo
	) {
		key = UUID.randomUUID();
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.EmailAddress = emailAddress;
		this.Estado = 1;
		this.Tipo = tipo;
		this.HorasVuelo = horasVuelo;
		this.NroMillas = nroMillas;
		this.KeyCargo = keyCargo;
	}

	public void eventCreado() {
		addDomainEvent(new PersonalRegistrado(key, Nombre));
	}

	public UUID getKey() {
		return key;
	}

	public void setKey(UUID key) {
		this.key = key;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.EmailAddress = emailAddress;
	}

	public Integer getEstado() {
		return Estado;
	}

	public void setEstado(Integer estado) {
		this.Estado = estado;
	}

	public String getTipo() {
		return this.Tipo;
	}

	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}

	public HorasVuelo getHorasVuelo() {
		return this.HorasVuelo;
	}

	public void setHorasVuelo(HorasVuelo horasVuelo) {
		this.HorasVuelo = horasVuelo;
	}

	public Double getNroMillas() {
		return this.NroMillas;
	}

	public void setNroMillas(Double nroMillas) {
		this.NroMillas = nroMillas;
	}

	public UUID getKeyCargo() {
		return KeyCargo;
	}

	public void setKeyCargo(UUID keyCargo) {
		this.KeyCargo = keyCargo;
	}
}
