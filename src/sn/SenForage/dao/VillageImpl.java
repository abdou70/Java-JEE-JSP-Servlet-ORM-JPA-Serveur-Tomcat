package sn.SenForage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.SenForage.entities.Village;

public class VillageImpl implements IVillage{
 private EntityManager em;
	public VillageImpl() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("SenForagePU");
		em =emf.createEntityManager();
	}

	@Override
	public Village add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return village;
			
		}catch(Exception ex){
			ex.printStackTrace();
				return null;	
		}
	}

	@Override
	public List<Village> list() {
		
		return em.createQuery("SELECT p FROM Village p",Village.class).getResultList();
	}

	@Override
	public Village getVillage(int idV) {
		return (Village)em.createQuery("SELECT v FROM Village v WHERE v.id=:idV")
			     .setParameter("idV",idV)
			     .getSingleResult();
	}
	

}
