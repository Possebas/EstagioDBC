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
	
//	public void salvar(Paises paises) {
//		boolean started = HibernateUtil.beginTransaction();
//		Transaction transaction = HibernateUtil.getSession().getTransaction();
//		try {
//			PAISES_DAO.criar(paises);
//			if(started) {
//				transaction.commit();
//			}
//		} catch (Exception e) {
//			transaction.rollback();
//			LOG.log(Level.SEVERE, e.getMessage(), e);
//		}
//	}
	
	public void salvarPaises(PaisesDTO paisesDTO) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		
		Paises paises = PAISES_DAO.parseFrom(paisesDTO);
		
		try {
			Paises paisesRes = PAISES_DAO.buscar(1);
			if(paisesRes == null) {
				PAISES_DAO.criar(paises);
			}else {
				paises.setId(paisesRes.getId());
				PAISES_DAO.atualizar(paises);
			}
			if (started) {
				transaction.commit();
			}
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

	public void buscar(Integer id) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			PAISES_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}
	
}
