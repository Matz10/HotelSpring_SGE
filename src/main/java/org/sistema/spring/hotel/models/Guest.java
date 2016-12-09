package org.sistema.spring.hotel.models;

public class Guest {
	
	private String name;
	private String dni;
	
	public Guest() {
	}

	public Guest(String name, String dni) {
		this.name = name;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", dni=" + dni + "]";
	}
	
	
	
	

}
