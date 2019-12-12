package br.com.davisampaio.jsfservlet.beans;

import javax.inject.Named;

@Named
public class TestBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
