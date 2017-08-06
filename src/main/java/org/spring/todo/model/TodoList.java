package org.spring.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TodoList {
	
	private String content;
	@Id
	private int id;
	private boolean isFlag;
	
	public String getContent() {
		return content;
	}
	public int getId() {
		return id;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
