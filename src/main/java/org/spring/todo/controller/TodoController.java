package org.spring.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.todo.model.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class); 
	@Autowired
	TodoList list;
	

	@RequestMapping("viewtodo")
	public String showList(){
		logger.info("Method showList()");
	
		return "home";
		
	}
}
