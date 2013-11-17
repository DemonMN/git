package model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int id;
	private String name;
	private List<User> children = new ArrayList<User>();
	
	public User(int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	public void add(User child) {
		children.add(child);
	}

	public User() {
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

	public List<User> getChildren() {
		return children;
	}

	public void setChildren(List<User> children) {
		this.children = children;
	}

}
