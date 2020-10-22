package sn.SenForage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.SenForage.entities.Client;
import sn.SenForage.entities.Village;

public class ClientImpl implements IClient{
 private EntityManager em;
 
	public ClientImpl() {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("SenForagePU");
	em = emf.createEntityManager();
}

	@Override
	public Client add(Client client) {
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			return client;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	@Override
	public List<Client> list() {
		
		return em.createQuery("SELECT p FROM Client p").getResultList();
	}

	@Override
	public List<Village> listVillages() {
		
		return em.createQuery("SELECT p FROM Village p").getResultList();
	}

	@Override
	public int Village() {
		// TODO Auto-generated method stub
		return 0;
	}


}
