package org.spring.todo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TodoList {
	
	@Id
	private int id;
	private String content;
	private boolean isFlag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	

}
