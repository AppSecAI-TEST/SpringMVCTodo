package org.spring.todo.dao;

import java.util.List;

import org.spring.todo.model.TodoList;
import org.springframework.stereotype.Repository;

@Repository
public class ListDAOImpl implements ListDAO {

	@Override
	public List<TodoList> getAll() {
		return null;
	}

	@Override
	public void addList(TodoList list) {

	}

	@Override
	public void deleteList(int id) {

	}

	@Override
	public void updateList(int id) {

	}

}
