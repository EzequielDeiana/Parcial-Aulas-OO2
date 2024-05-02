package negocio;

import java.util.List;

import dao.EdificioDAO;
import datos.Edificio;

public class EdificioABM {
	private static EdificioABM instance;
	
	private EdificioABM() {}
	
	public static EdificioABM getInstance() {
		if(instance == null) {
			instance = new EdificioABM();
		}
		return instance;
	}
	
	public long agregar(Edificio edificio) {
		return EdificioDAO.getInstance().agregar(edificio);
	}
	
	public void modificar(Edificio edificio) {
		EdificioDAO.getInstance().modificar(edificio);
	}
	
	public void eliminar(Edificio edificio) {
		EdificioDAO.getInstance().eliminar(edificio);
	}
	
	public Edificio traer(long id) {
		return EdificioDAO.getInstance().traer(id);
	}
	
	public List<Edificio> traer() {
		return EdificioDAO.getInstance().traer();
	}
	
	public Edificio traerEdificioConAulas(long id) {
		return EdificioDAO.getInstance().traerEdificioConAulas(id);
	}
}
