package dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import datos.Aula;
import datos.Aula;
import datos.Espacio;

public class AulaDAO extends DAO<Aula> {
	private static AulaDAO instance;
	
	private AulaDAO() {}
	
	public static AulaDAO getInstance() {
		if(instance == null) {
			instance = new AulaDAO();
		}
		return instance;
	}
	
	public long agregar(Aula aula) {
		return super.agregar(aula);
	}
	
	public void modificar(Aula aula) {
		super.modificar(aula);
	}
	
	public void eliminar(Aula aula) {
		super.eliminar(aula);
	}
	
	public Aula traer(long id) {
		return super.traer(id);
	}
	
	public List<Aula> traer() {
		return super.traer();
	}
	
	public Aula traerConEdificio(long id) {
		Aula aula = null;
		try {
			iniciaOperacion();
			aula = session.get(Aula.class, id);
			Hibernate.initialize(aula.getEdificio());
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return aula;
	}
	
	public Aula traerConEspacios(long id) {
		Aula aula = null;
		try {
			iniciaOperacion();
			aula = session.get(Aula.class, id);
			Hibernate.initialize(aula.getEspacios());
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return aula;
	}
	
	public void cargarEspacios(Aula aula) {
		try {
			iniciaOperacion();
			Hibernate.initialize(aula.getEspacios());
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
	}
}
