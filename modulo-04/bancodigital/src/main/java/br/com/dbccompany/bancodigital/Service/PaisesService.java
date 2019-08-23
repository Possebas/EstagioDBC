package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.PaisesDAO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Paises;

public class PaisesService {

	private static final PaisesDAO PAISES_DAO = new PaisesDAO();
	private static final Logger LOG = Logger.getLogger(PaisesService.class.getName());
	
	public void salvarPaises(Paises paises) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			PAISES_DAO.criar(paises);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}
	
}
