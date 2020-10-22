package sn.SenForage.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.SenForage.entities.User;

public class UserImpl implements IUser{
private EntityManager em ;

public UserImpl() {
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("SenForagePU");
	em = emf.createEntityManager();
}
      @Override
	public User add(User user) {
		try {
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return user;
			
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}
	@Override
	public List<User> list() {
		
		return em.createQuery("SELECT p FROM User p").getResultList();
	}

    
}
