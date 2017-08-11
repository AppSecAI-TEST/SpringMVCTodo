package org.spring.todo.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.todo.model.TodoList;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ListDAOImpl implements ListDAO {

	private static final Logger logger = LoggerFactory.getLogger(ListDAOImpl.class); 

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public TodoList save(TodoList todoList) {
		logger.info("Method save dao start");

		em.persist(todoList);		
		em.flush();
		
		return todoList;
	}

	
}
