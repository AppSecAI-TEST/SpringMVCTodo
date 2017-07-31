package org.spring.todo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.todo.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan("org.spring.todo.controller")
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class); 
//	@Autowired
//	TodoList list;
//	@Autowired
//	private SessionFactory sf;

	@RequestMapping("viewtodo")
	public String showList(){
		logger.info("Method showList()");
//	Session session = sf.getCurrentSession();
		return "home";
		
	}
}
