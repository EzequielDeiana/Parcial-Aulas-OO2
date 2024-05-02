package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import datos.Edificio;

public class EdificioDAO extends DAO<Edificio> {
	private static EdificioDAO instance;
	
	private EdificioDAO() {}
	
	public static EdificioDAO getInstance() {
		if(instance == null) {
			instance = new EdificioDAO();
		}
		return instance;
	}
	
	public long agregar(Edificio edificio) {
		return super.agregar(edificio);
	}
	
	public void modificar(Edificio edificio) {
		super.modificar(edificio);
	}
	
	public void eliminar(Edificio edificio) {
		super.eliminar(edificio);
	}
	
	public Edificio traer(long id) {
		return super.traer(id);
	}
	
	public List<Edificio> traer() {
		return super.traer();
	}
	
	public Edificio traerEdificioConAulas(long id) {
		Edificio edificio = null;
		try {
			iniciaOperacion();
			edificio = session.get(Edificio.class, id);
			Hibernate.initialize(edificio.getAulas());
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return edificio;
	}
}
