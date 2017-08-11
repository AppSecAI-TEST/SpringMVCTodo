package org.spring.todo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.todo.dao.ListDAO;
import org.spring.todo.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl implements ListService {

	private static final Logger logger = LoggerFactory.getLogger(ListServiceImpl.class); 

	
	@Autowired
	private ListDAO listDao;
	
	@Override
	public TodoList save(TodoList todoList) {
		logger.info("Method save service start");
		
		System.out.println(todoList);
		
		return listDao.save(todoList);
		
	}

}
