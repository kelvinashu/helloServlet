package za.co.pvi.services;

import javax.persistence.EntityManager;

import za.co.pvi.entities.Task;
import za.co.pvi.utils.EntityManagement;

public class TaskService {
	
	public void createTask(String description) {
		
		EntityManager entityManager = EntityManagement.getEntityManager();
		entityManager.getTransaction().begin();
		Task task = new Task();
		task.setDescription(description);
		
		entityManager.persist(task);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		
	}

}
