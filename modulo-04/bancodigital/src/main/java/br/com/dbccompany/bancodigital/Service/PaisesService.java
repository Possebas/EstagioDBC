package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.PaisesDAO;
import br.com.dbccompany.bancodigital.Dto.PaisesDTO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Paises;

public class PaisesService {

	private static final PaisesDAO PAISES_DAO = new PaisesDAO();
	private static final Logger LOG = Logger.getLogger(PaisesService.class.getName());
	
	public void salvarPaises(PaisesDTO paisesDTO) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		
		Paises paises = PAISES_DAO.parseFrom(paisesDTO);
		
		try {
			PAISES_DAO.criar(paises);
			if (started) {
				transaction.commit();
			}
			paisesDTO.setIdPaises(paises.getId());
		} catch( Exception e ){
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
		
	}

	public void remover(Paises pais) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			PAISES_DAO.remover(pais);
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
			PAISES_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Paises pais) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			PAISES_DAO.atualizar(pais);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public Paises buscar(Integer id) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		Paises pais = null;
		try {
			pais = PAISES_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
			return pais;
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
		return pais;
	}
	
}
