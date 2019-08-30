package br.com.dbccompany.vemserSpring.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

public class PersonagemService {

	//private static final BairrosDAO BAIRROS_DAO = new BairrosDAO();
	/* private static final Logger LOG = Logger.getLogger(BairrosService.class.getName());

	public void salvar(BairrosDTO bairro) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();

		Bairros bairros  = BAIRROS_DAO.parseFrom(bairro);
		try {
			BAIRROS_DAO.criar(bairros);
			if(started) {
				transaction.commit();
			}
			bairro.setIdBairros(bairros.getId());
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	} */
}
