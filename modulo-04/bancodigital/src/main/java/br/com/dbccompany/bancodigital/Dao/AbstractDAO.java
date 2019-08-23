package br.com.dbccompany.bancodigital.Dao;

import org.hibernate.Session;

import br.com.dbccompany.bancodigital.Entity.AbstractEntity;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;

public abstract class AbstractDAO<E extends AbstractEntity> {
	
	protected abstract Class<E> getEntityClass();
	
	public void criar( E entity ) {
		Session session = HibernateUtil.getSession();
		session.save( entity );
	}
	
	public void atualizar( E entity ) {
		criar( entity );
	}
	
	public void remover( Integer id ) {
		Session session = HibernateUtil.getSession();
		session.createQuery( "delete from "+ getEntityClass().getSimpleName() +" where id = "+ id ).executeUpdate();
	}
	
	public void remover( E entity ) {
		remover( entity.getId() );
	}
	

	@SuppressWarnings("unchecked")
	public E buscar( Integer id ) {
		Session session = HibernateUtil.getSession();
		return (E) session.createQuery( "select e from "+ getEntityClass().getSimpleName() 
				                       +" where id = "+ id ).uniqueResult();
	}
}
