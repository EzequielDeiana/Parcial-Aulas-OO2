package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import datos.Aula;
import datos.Edificio;
import datos.Espacio;

public class EspacioDAO extends DAO<Espacio> {
	private static EspacioDAO instance;
	
	private EspacioDAO() {}
	
	public static EspacioDAO getInstance() {
		if(instance == null) {
			instance = new EspacioDAO();
		}
		return instance;
	}
	
	public long agregar(Espacio edificio) {
		return super.agregar(edificio);
	}
	
	public void modificar(Espacio edificio) {
		super.modificar(edificio);
	}
	
	public void eliminar(Espacio edificio) {
		super.eliminar(edificio);
	}
	
	public Espacio traer(long id) {
		return super.traer(id);
	}
	
	public List<Espacio> traer() {
		return super.traer();
	}
	
	public Espacio traer(LocalDate fecha, char turno, Aula aula) {
		Espacio espacio = null;
		try {
			iniciaOperacion();
			espacio = (Espacio) session.createQuery("from Espacio e where e.fecha = :fecha and e.turno = :turno")
					.setParameter("fecha", fecha)
					.setParameter("turno", turno)
					.uniqueResult();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return espacio;
	}
}
