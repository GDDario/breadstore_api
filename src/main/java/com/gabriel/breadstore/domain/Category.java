package com.gabriel.breadstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Category {
	private int id;
	private String name;
	private String description;
	private List<Bread> breads = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Bread> getBreads() {
		return breads;
	}

	public void setBreads(List<Bread> breads) {
		this.breads = breads;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return id == other.id;
	}

}
