package org.spring.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
