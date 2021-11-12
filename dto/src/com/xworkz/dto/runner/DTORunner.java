package com.xworkz.dto.runner;

import com.xworkz.dto.Bluetooth;
import com.xworkz.dto.Cement;
import com.xworkz.dto.ChargerDTO;
import com.xworkz.dto.DishDTO;
import com.xworkz.dto.SolarDto;
import com.xworkz.dto.StatueDTO;
import com.xworkz.dto.Vehicle;

public class DTORunner {

	public static void main(String[] args) {


		Bluetooth blutooth = new Bluetooth();

		blutooth.setBrand("Boat");
		blutooth.setColor("Red");
		blutooth.sethZ(60);
		blutooth.setPrice(800);


		String name	=blutooth.getBrand();
		String clr= blutooth.getColor();
		System.out.println(name.concat(" ").concat(clr).concat(" ").concat(clr).concat(" ").concat(String.valueOf(blutooth.gethZ())).concat(" ").concat(String.valueOf(blutooth.getPrice())));
		
		
		
		Cement cement = new Cement();
		
		cement.setBrand("ACC");
		cement.setPrice(400);
		cement.setkG(25);
		cement.setIsiMark(true);
		cement.setGypSum(true);

		String name1=cement.getBrand();
		System.out.println(name1.concat(" ").concat(String.valueOf(cement.getkG())).concat(" ").concat(String.valueOf(cement.getPrice())).concat(" ") .concat(String.valueOf(true)).concat(" ").concat(String.valueOf(true)));
		
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setCompany("Honda");
		vehicle.setColor("White");
		vehicle.setNumber("KA26 M 2568");
		vehicle.setType(true);
		vehicle.setPirce(70000);
		
		String name3=vehicle.getCompany();
		String clr1=vehicle.getColor();
		String set1 = vehicle.getNumber();
		
		System.out.println(name3.concat(" ").concat(clr1).concat(" ").concat(set1).concat(" ").concat(String.valueOf(vehicle.getPirce())).concat(" ") .concat(String.valueOf(vehicle.isType())));
		
		
		SolarDto solarDTO = new SolarDto();
		solarDTO.setBrand("V-Guard");
		solarDTO.setColor("White");
		solarDTO.setPrice(10005.2);
		solarDTO.setLength(15);
		solarDTO.setCapacity(1200);
		
		System.out.println(solarDTO.getBrand().concat(" ").concat(solarDTO.getColor()).concat(" ").concat(String.valueOf(solarDTO.getPrice()).concat(" ")).concat(String.valueOf(solarDTO.getLength()).concat(" ")).concat(String.valueOf(solarDTO.getCapacity()).concat(" ")));
		
		StatueDTO statueDTO = new StatueDTO();
		statueDTO.setBrand("grace");
		statueDTO.setColor("Black");
		statueDTO.setPrice(2000.5);
		statueDTO.setSize(58);
		
		System.out.println(statueDTO.getBrand().concat(" ").concat(statueDTO.getColor()).concat(" ").concat(String.valueOf(statueDTO.getPrice()).concat(" ")).concat(String.valueOf(statueDTO.getSize()).concat(" ")));
		
		
		DishDTO dishDTO = new DishDTO();
		dishDTO.setBrand("Airtel");
		dishDTO.setColor("Gray");
		dishDTO.setPrice(5000.99);
		dishDTO.setNoOfChannels(155);
		
		System.out.println(dishDTO.getBrand().concat(" ").concat(dishDTO.getColor()).concat(" ").concat(String.valueOf(dishDTO.getPrice()).concat(" ")).concat(String.valueOf(dishDTO.getNoOfChannels()).concat(" ")));
		
		
		
		ChargerDTO dto = new ChargerDTO();
		dto.setName("Poco");
		dto.setType("Type C");
		dto.setInput(200);
		dto.setOutput(2);
		dto.setContryMade("India");
		
		
		System.out.println(dto.getName().concat(" ").concat(dto.getType()).concat(" ").concat(String.valueOf(dto.getInput())).concat(" ").concat(String.valueOf(dto.getOutput())).concat(" ").concat(dto.getContryMade()));
	}
	
	
	
	
}
