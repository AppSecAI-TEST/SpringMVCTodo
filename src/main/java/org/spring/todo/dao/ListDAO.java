package org.spring.todo.dao;

import java.util.List;

import org.spring.todo.model.TodoList;

public interface ListDAO {
	
	List<TodoList> getAll();
	void addList(TodoList list);
	void deleteList(int id);
	void updateList(int id);
	

}
