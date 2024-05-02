package dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DAO<T> {
	protected static Session session;
	protected Transaction transaction;
	private Class<T> clasePersistente;
	
	@SuppressWarnings("unchecked")
	protected DAO() {
		this.clasePersistente = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	protected void iniciaOperacion() {
		session = HibernateUtil.getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}
	
	protected void manejaException(HibernateException he) {
		transaction.rollback();
		throw he;
	}
	
	protected long agregar(T objeto) {
		long id = -1;
		try {
			iniciaOperacion();
			id = (long) session.save(objeto);
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return id;
	}

	protected void modificar(T objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
	}

	protected void eliminar(T objeto) {
		try {
			iniciaOperacion();
			session.delete(objeto);
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
	}
	
	protected T traer(long id) {
		T objeto = null;
		try {
			iniciaOperacion();
			objeto = session.get(clasePersistente, id);
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> traer() {
		List<T> objeto = null;
		try {
			iniciaOperacion();
			objeto = session.createQuery("from " + clasePersistente.getName()).getResultList();
			transaction.commit();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	/*
	 * Pendiente por evaluar
	 * 
	@SuppressWarnings("unchecked")
	protected T traerPorHQLUnico(String hql) throws HibernateException  {
    	T objeto = null;
    	try {
            iniciaOperacion(); 
            objeto = (T) session.createQuery("from "+clasePersistente.getName()+" o "+hql).uniqueResult();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
        return objeto;
    }
 	
 	@SuppressWarnings("unchecked")
	protected List<T> traerPorHQLista(String hql) throws HibernateException  {
    	List<T> lista = null;
    	try {
            iniciaOperacion(); 
        	lista=session.createQuery("from "+clasePersistente.getName()+" o "+hql).list();
		} catch (HibernateException he) {
			manejaException(he);
		} finally {
			session.close();
		}
        return lista;
    }
	 */
}
