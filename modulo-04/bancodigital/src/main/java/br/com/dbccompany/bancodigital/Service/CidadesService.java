package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.CidadesDAO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Cidades;

public class CidadesService {

	private static final CidadesDAO CIDADES_DAO = new CidadesDAO();
	private static final Logger LOG = Logger.getLogger(CidadesService.class.getName());
	
	public void salvar(Cidades cidade) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CIDADES_DAO.criar(cidade);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

    public void remover(Cidades cidade) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CIDADES_DAO.remover(cidade);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void remover(Integer id) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CIDADES_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Cidades cidade) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CIDADES_DAO.atualizar(cidade);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void buscar(Integer id) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CIDADES_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

}
