package datos;

import java.time.LocalDate;
import java.util.Objects;

public class Espacio {
	private long idEspacio;
	private LocalDate fecha;
	private char turno;
	private Aula aula;
	private boolean libre;

	public Espacio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Espacio(LocalDate fecha, char turno, Aula aula, boolean libre) {
		super();
		this.fecha = fecha;
		this.turno = turno;
		this.aula = aula;
		this.libre = libre;
	}

	public long getIdEspacio() {
		return idEspacio;
	}

	public void setIdEspacio(long idEspacio) {
		this.idEspacio = idEspacio;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(aula, idEspacio, libre, turno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Espacio other = (Espacio) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(fecha, other.fecha) && idEspacio == other.idEspacio
				&& libre == other.libre && turno == other.turno;
	}

	@Override
	public String toString() {
		return "Espacio [idEspacio=" + idEspacio + ", fecha=" + fecha + ", turno=" + turno + ", libre=" + libre + "]";
	}

}
