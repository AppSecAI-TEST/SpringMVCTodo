package org.spring.todo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIST")
public class TodoList {
	
	
	@Id
	@Column(name="LIST_ID")
	@GeneratedValue
	private int id;
	
	@Column(name="DATA")
	private String content;
	
	@Column(name="FLAG")
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
