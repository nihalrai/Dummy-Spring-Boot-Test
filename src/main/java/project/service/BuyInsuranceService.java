package project.service;

import org.springframework.stereotype.Service;

import project.entity.Vehicle;
import project.exception.BuyInsuranceServiceException;

public interface BuyInsuranceService {

	void submissionOfInsuranceDetails(Vehicle vehicle) throws BuyInsuranceServiceException;

}