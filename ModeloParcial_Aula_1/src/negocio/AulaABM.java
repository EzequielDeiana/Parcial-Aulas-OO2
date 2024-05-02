package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.AulaDAO;
import dao.EspacioDAO;
import datos.Aula;
import datos.Espacio;

public class AulaABM {
	private static AulaABM instance;
	
	private AulaABM() {}
	
	public static AulaABM getInstance() {
		if(instance == null) {
			instance = new AulaABM();
		}
		return instance;
	}
	
	public long agregar(Aula edificio) {
		return AulaDAO.getInstance().agregar(edificio);
	}
	
	public void modificar(Aula edificio) {
		AulaDAO.getInstance().modificar(edificio);
	}
	
	public void eliminar(Aula edificio) {
		AulaDAO.getInstance().eliminar(edificio);
	}
	
	public Aula traer(long id) {
		return AulaDAO.getInstance().traer(id);
	}
	
	public List<Aula> traer() {
		return AulaDAO.getInstance().traer();
	}
	
	public boolean agregar(LocalDate fecha, char turno, Aula aula, boolean libre) throws Exception {
		if(EspacioDAO.getInstance().traer(fecha, turno, aula) != null) {
			throw new Exception("Repetido");
		}
		
		boolean agregado = aula.agregar(new Espacio(fecha, turno, aula, libre));
		AulaDAO.getInstance().modificar(aula);
		return agregado;
	}
	
	public void agregarEspaciosMes(int mes, int anio, char turno, Aula aula) throws Exception {
		LocalDate fecha = LocalDate.of(anio, mes, 1);
		Espacio espacio = null;
		while(mes == fecha.getMonthValue()) {
			espacio = EspacioDAO.getInstance().traer(fecha, turno, aula);
			if(espacio != null) {
				EspacioDAO.getInstance().eliminar(espacio);
			}
			
			espacio = new Espacio(fecha, turno, aula, true);
			aula.agregar(espacio);
				
			fecha = fecha.plusDays(1);
		}
		AulaDAO.getInstance().modificar(aula);
	}
	
	public Aula traerConEdificio(long id) {
		return AulaDAO.getInstance().traerConEdificio(id);
	}
	
	public Aula traerConEspacios(long id) {
		return AulaDAO.getInstance().traerConEspacios(id);
	}
}
