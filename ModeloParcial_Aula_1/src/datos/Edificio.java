package datos;

import java.util.Objects;
import java.util.Set;

public class Edificio {
	private long idEdificio;
	private String edificio;
	
	private Set<Aula> aulas;

	public Edificio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Edificio(String edificio) {
		super();
		this.edificio = edificio;
	}

	public long getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(long idEdificio) {
		this.idEdificio = idEdificio;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public Set<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(Set<Aula> aulas) {
		this.aulas = aulas;
	}
	
	@Override
	public String toString() {
		return "Edificio [idEdificio=" + idEdificio + ", edificio=" + edificio + "]";
	}

}
