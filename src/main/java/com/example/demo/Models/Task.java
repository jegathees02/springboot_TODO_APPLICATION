package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	private int id;
	private String name;
	private boolean iscompleted;
	public Task(int id, String name, boolean iscompleted) {
		super();
		this.id = id;
		this.name = name;
		this.iscompleted = iscompleted;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIscompleted() {
		return iscompleted;
	}
	public void setIscompleted(boolean iscompleted) {
		this.iscompleted = iscompleted;
	}
	

}
