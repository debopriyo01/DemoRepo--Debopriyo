package com.greatlearning.springMvcdemo;

import java.util.LinkedHashMap;

public class Student_Details {

	// Inserting The Details of the Student hear :-

	private String First_Name;
	private String Last_Name;
	private String conuntry;
	private  LinkedHashMap<String,String> contries;
	private String[] favouritelanguage;
	private String operetionSystem;

	// Constactor To Implemented the Contry values:-
	public  Student_Details() {

		contries=new LinkedHashMap<>();
		contries.put("IN", "India");
		contries.put("US", "America");
		contries.put("London","United KingDom");
		contries.put("Af", "Afganistan");
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getConuntry() {
		return conuntry;
	}

	public void setConuntry(String conuntry) {
		this.conuntry = conuntry;
	}

	public LinkedHashMap<String, String> getContries() {
		return contries;
	}

	public void setContries(LinkedHashMap<String, String> contries) {
		this.contries = contries;
	}

	public String[] getFavouritelanguage() {
		return favouritelanguage;
	}

	public void setFavouritelanguage(String[] favouritelanguage) {
		this.favouritelanguage = favouritelanguage;
	}

	public String getOperetionSystem() {
		return operetionSystem;
	}

	public void setOperetionSystem(String operetionSystem) {
		this.operetionSystem = operetionSystem;
	}


}
