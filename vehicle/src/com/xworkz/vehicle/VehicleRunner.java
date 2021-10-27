package com.xworkz.vehicle;

import com.xworkz.vehicle.operator.VehicleOperator;

public class VehicleRunner {

	public static void main(String[] args) {

		
		VehicleOperator operator = new VehicleOperator();
		operator.riding("Hero Motor Crop");
		operator.riding("Honda");
		operator.riding("Bajaj");
		operator.riding("Suzuki");
		operator.riding("TVS");
	}

}
