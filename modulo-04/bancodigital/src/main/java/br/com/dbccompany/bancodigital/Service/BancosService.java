package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.BancosDAO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Bancos;

public class TelefonesService {

	private static final BancosDAO BANCOS_DAO = new BancosDAO();
	private static final Logger LOG = Logger.getLogger(BairrosService.class.getName());
	
	public void salvar(Bancos banco) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			BANCOS_DAO.criar(banco);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

    public void remover(Bancos banco) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			BANCOS_DAO.remover(banco);
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
			BANCOS_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Bancos banco) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			BANCOS_DAO.atualizar(banco);
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
			BANCOS_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
    }
    
}