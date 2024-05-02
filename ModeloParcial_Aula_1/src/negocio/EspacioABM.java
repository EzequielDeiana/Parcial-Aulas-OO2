package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.EspacioDAO;
import datos.Aula;
import datos.Espacio;

public class EspacioABM {
	private static EspacioABM instance;
	
	private EspacioABM() {}
	
	public static EspacioABM getInstance() {
		if(instance == null) {
			instance = new EspacioABM();
		}
		return instance;
	}
	
	public long agregar(Espacio edificio) {
		return EspacioDAO.getInstance().agregar(edificio);
	}
	
	public void modificar(Espacio edificio) {
		EspacioDAO.getInstance().modificar(edificio);
	}
	
	public void eliminar(Espacio edificio) {
		EspacioDAO.getInstance().eliminar(edificio);
	}
	
	public Espacio traer(long id) {
		return EspacioDAO.getInstance().traer(id);
	}
	
	public List<Espacio> traer() {
		return EspacioDAO.getInstance().traer();
	}
	
	public Espacio traer(LocalDate fecha, char turno, Aula aula) {
		return EspacioDAO.getInstance().traer(fecha, turno, aula);
	}
}
