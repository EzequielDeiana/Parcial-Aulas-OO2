package datos;

import java.util.Objects;
import java.util.Set;

public abstract class Aula {
	protected long idAula;
	protected int numero;
	protected Edificio edificio;
	protected Set<Espacio> espacios;

	public Aula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aula(int numero, Edificio edificio) {
		super();
		this.numero = numero;
		this.edificio = edificio;
	}

	public long getIdAula() {
		return idAula;
	}

	public void setIdAula(long idAula) {
		this.idAula = idAula;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edificio, idAula, numero);
	}

	public Set<Espacio> getEspacios() {
		return espacios;
	}

	public void setEspacios(Set<Espacio> espacios) {
		this.espacios = espacios;
	}
	
	public boolean agregar(Espacio espacio) {
		return espacios.add(espacio);
	}
	
	public boolean remover(Espacio espacio) {
		return espacios.remove(espacio);
	}


	@Override
	public String toString() {
		return "idAula=" + idAula + ", numero=" + numero;
	}

}
