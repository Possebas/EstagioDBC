package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.TelefonesDAO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Telefones;

public class TelefonesService {

	private static final TelefonesDAO TELEFONES_DAO = new TelefonesDAO();
	private static final Logger LOG = Logger.getLogger(BairrosService.class.getName());
	
	public void salvar(Telefones telefone) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			TELEFONES_DAO.criar(telefone);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

    public void remover(Telefones telefone) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			TELEFONES_DAO.remover(telefone);
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
			TELEFONES_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Telefones telefone) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			TELEFONES_DAO.atualizar(telefone);
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
			TELEFONES_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
    }
    
}