package org.spring.todo.dao;


import org.spring.todo.model.TodoList;


public interface ListDAO {
	
	public TodoList save(TodoList todoList);

}
