package org.spring.todo.service;

import org.spring.todo.model.TodoList;
import org.springframework.stereotype.Service;

@Service
public class ListServiceImpl implements ListService {

	@Override
	public TodoList save(TodoList todoList) {
		System.out.println(todoList);
		return null;
	}

}
