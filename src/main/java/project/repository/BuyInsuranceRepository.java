package project.repository;

import project.entity.Customer;
import project.entity.Vehicle;

public interface BuyInsuranceRepository {
	
	boolean isSameVehicleIsInsuredAlready(String registrationNo);
	
	void submitData(Vehicle vehicle);

}