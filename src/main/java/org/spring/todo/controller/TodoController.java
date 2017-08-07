package org.spring.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.todo.model.TodoList;
import org.spring.todo.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoController.class); 

	@Autowired
	private ListService listService;

	
	@RequestMapping("view")
	public String showList(){
		logger.info("Method showList()");
//	Session session = sf.getCurrentSession();
		return "home";
		
	}
	
	@RequestMapping(value="viewtodo" ,method = RequestMethod.GET)
	public String save(){
		logger.info("Method show() start");
		TodoList todoList = new TodoList(); 
		todoList.setContent("get milk yo");
		todoList.setFlag(true);
		listService.save(todoList);
		logger.info("Method show() end");
		return "home";
	}
}
