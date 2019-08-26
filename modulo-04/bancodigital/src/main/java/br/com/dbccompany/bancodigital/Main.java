package br.com.dbccompany.bancodigital;

import java.util.logging.Logger;

import br.com.dbccompany.bancodigital.Dto.PaisesDTO;
import br.com.dbccompany.bancodigital.Service.PaisesService;

public class Main {
	
	private static final Logger LOG = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		PaisesService service = new PaisesService();
		PaisesDTO paises = new PaisesDTO();
		paises.setNome("Argentina");
		service.salvarPaises(paises);
		System.out.println("Pais salvo => "+ paises.getNome());
		
	}
	
/*	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			
			//Paises paises = new Paises();
			//paises.setNome("Brasil");
			
			//session.save(paises);
			
			//session.createQuery("select * from paises;").executeUpdate();
			Criteria criteria = session.createCriteria(Paises.class);
			criteria.createAlias("nome", "nome_pais");
			criteria.add(
					Restrictions.isNotNull("nome") 
			);
			
			List<Paises> lstPaises = criteria.list();
			
			transaction.commit();
			
		} catch (Exception e) {
			if ( transaction != null ) {
				transaction.rollback();
			}
			LOG.log(Level.SEVERE, e.getMessage(), e);
			System.exit(1);  //erro
			
		} finally {
			if ( session != null ) {
				session.close();
			}
		}
		System.exit(0);  //sucesso
	}
	*/
}
