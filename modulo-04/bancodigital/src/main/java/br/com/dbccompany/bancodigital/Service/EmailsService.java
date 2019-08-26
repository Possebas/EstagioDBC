package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.EmailsDAO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Emails;

public class EmailsService {

	private static final EmailsDAO EMAILS_DAO = new EmailsDAO();
	private static final Logger LOG = Logger.getLogger(BairrosService.class.getName());
	
	public void salvar(Emails email) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			EMAILS_DAO.criar(email);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

    public void remover(Emails email) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			EMAILS_DAO.remover(email);
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
			EMAILS_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Emails email) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			EMAILS_DAO.atualizar(email);
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
			EMAILS_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
    }
    
}