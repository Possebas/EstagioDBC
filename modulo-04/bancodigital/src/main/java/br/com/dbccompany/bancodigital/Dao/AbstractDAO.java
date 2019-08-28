package br.com.dbccompany.bancodigital.Dao;

import java.util.List;

import org.hibernate.Session;

import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.AbstractEntity;

public abstract class AbstractDAO<E extends AbstractEntity> {
	
	protected abstract Class<E> getEntityClass();
	
	public void criar(E entity) {
		Session session = HibernateUtil.getSession();
		session.save( entity );
	}
	
	public void atualizar( E entity ) {
		criar( entity );
	}
	
	public void remover(Integer id) {
		Session session = HibernateUtil.getSession();
		session.createQuery("delete from " +  getEntityClass().getSimpleName() + "where id = " + id).executeUpdate();
	}
	
	public void remover(E entity) {
		remover( entity.getId() );
	}

	@SuppressWarnings("unchecked")
	public E buscar(Integer id) {
		Session session = HibernateUtil.getSession();
		return (E) session.createQuery("from " + getEntityClass().getSimpleName() + " where id = " + id).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<E> listar() {
		Session session = HibernateUtil.getSession();
		return session.createCriteria(getEntityClass()).list();
	}
}
