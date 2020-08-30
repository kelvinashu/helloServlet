package za.co.pvi.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class EntityManagement {

	private static EntityManager em;
	private static EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME = "taskPersistence";

	public static EntityManager getEntityManager() {

		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		return em;
	}
}
