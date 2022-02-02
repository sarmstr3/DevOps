package com.aspen.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspen.main.dao.CustomerRepository;
import com.aspen.main.orm.Customer;

import lombok.Data;

@Data
@RestController
public class Controller {

	@Autowired
	private CustomerRepository customerRepo;
	
	@PostMapping("/addNewCustomer")
	private String insertCustomer(CustomerPayload payload ) {
			Customer c = new Customer();
			  c.firstName = payload.firstName;
			  c.lastName = payload.lastName;
			  c.street = payload.street;
			  c.city = payload.city;
			  c.state = payload.state;
			  c.phoneNum = payload.phoneNum;
			  c.driverLicenseNo = payload.driverLicenseNo;
			  c.skierType = payload.skierType;
			  c.snowboardStance = payload.snowboardStance;
			  c.customStanceL = payload.customStanceL;
			  c.customStanceR = payload.customStanceR;
			  c.weight = payload.weight;
			  c.height = payload.height;
			  c.age = payload.age;
			  c.numOfRentalDays = payload.numOfRentalDays;
			  c.damageWaiver = payload.damageWaiver;
			  c.snowboard = payload.snowboard;
			  c.ski = payload.ski;
			  c.bootSize = payload.bootSize;
			  c.poles = payload.poles;
			  c.rentalSize = payload.rentalSize;
			  
			  customerRepo.save(c);

		return null;
	}
}
