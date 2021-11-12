package com.xworkz.dto;

public class ChargerDTO {

	private String name;
	private String type;
	private int input;
	private int output;
	private String contryMade;
	
	
	public ChargerDTO() {
		System.out.println("Invoked ChargerDTO");
	}

	

	public ChargerDTO(String name, String type, int input, int output, String contryMade) {
		super();
		this.name = name;
		this.type = type;
		this.input = input;
		this.output = output;
		this.contryMade = contryMade;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getInput() {
		return input;
	}


	public void setInput(int input) {
		this.input = input;
	}


	public int getOutput() {
		return output;
	}


	public void setOutput(int output) {
		this.output = output;
	}


	public String getContryMade() {
		return contryMade;
	}


	public void setContryMade(String contryMade) {
		this.contryMade = contryMade;
	}
	
	
	
}
