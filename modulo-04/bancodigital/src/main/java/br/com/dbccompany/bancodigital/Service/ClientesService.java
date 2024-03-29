package br.com.dbccompany.bancodigital.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Transaction;

import br.com.dbccompany.bancodigital.Dao.ClientesDAO;
import br.com.dbccompany.bancodigital.Dto.ClientesDTO;
import br.com.dbccompany.bancodigital.Entity.HibernateUtil;
import br.com.dbccompany.bancodigital.Entity.Agencias;
import br.com.dbccompany.bancodigital.Entity.Clientes;

public class ClientesService {

	private static final ClientesDAO CLIENTES_DAO = new ClientesDAO();
	private static final Logger LOG = Logger.getLogger(BairrosService.class.getName());
	
	public void salvar(ClientesDTO cliente) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		Clientes clientes  = CLIENTES_DAO.parseFrom(cliente);
		try {
			CLIENTES_DAO.criar(clientes);
			cliente.setIdCliente(clientes.getId());
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

    public void remover(Clientes cliente) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CLIENTES_DAO.remover(cliente);
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
			CLIENTES_DAO.remover(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public void atualizar(Clientes cliente) {
		boolean started = HibernateUtil.beginTransaction();
		Transaction transaction = HibernateUtil.getSession().getTransaction();
		try {
			CLIENTES_DAO.atualizar(cliente);
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
			CLIENTES_DAO.buscar(id);
			if(started) {
				transaction.commit();
			}
		} catch (Exception e) {
			transaction.rollback();
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
    }
    
}