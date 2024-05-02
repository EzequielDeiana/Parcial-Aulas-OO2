package datos;

import java.util.Objects;

public class Tradicional extends Aula {
	private int cantBancos;
	private char pizarron;
	private boolean tieneProyector;

	public Tradicional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tradicional(int numero, Edificio edificio, int cantBancos, char pizarron, boolean tieneProyector) {
		super(numero, edificio);
		this.cantBancos = cantBancos;
		this.pizarron = pizarron;
		this.tieneProyector = tieneProyector;
	}

	public int getCantBancos() {
		return cantBancos;
	}

	public void setCantBancos(int cantBancos) {
		this.cantBancos = cantBancos;
	}

	public char getPizarron() {
		return pizarron;
	}

	public void setPizarron(char pizarron) {
		this.pizarron = pizarron;
	}

	public boolean isTieneProyector() {
		return tieneProyector;
	}

	public void setTieneProyector(boolean tieneProyector) {
		this.tieneProyector = tieneProyector;
	}


	@Override
	public String toString() {
		return "Tradicional [" + super.toString() + "cantBancos=" + cantBancos + ", pizarron=" + pizarron
				+ ", tieneProyector=" + tieneProyector + "]";
	}

}
