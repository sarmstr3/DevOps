package com.aspen.main;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerPayload {

	
	public String firstName;
	public String lastName;
	public String street;
	public String city;
	public String state;
	public String zip;
	public String phoneNum;
	public String driverLicenseNo;
	public String skierType;
	public String snowboardStance;
	public int customStanceL;
	public int customStanceR;
	public int weight;
	public int height;
	public int age;
	public int numOfRentalDays;
	public int damageWaiver;
	public int snowboard;
	public int ski;
	public double bootSize;
	public String poles;
	public String rentalSize;
	
	@SuppressWarnings("unchecked")
	@JsonProperty("msg")
	private void unpackMsg(Map<String, Object> msg) {
		this.firstName = (String)msg.get("firstName");
		this.lastName = (String)msg.get("lastName");
		this.street = (String)msg.get("street");
		this.city = (String)msg.get("city");
		this.state = (String)msg.get("state");
		this.zip = (String)msg.get("zip");
		this.phoneNum = (String)msg.get("phoneNum");
		this.driverLicenseNo = (String)msg.get("driverLicenseNo");
		this.skierType = (String)msg.get("skierType");
		this.snowboardStance = (String)msg.get("snowboardStance");
		this.customStanceL = (int)msg.get("customStanceL");
		this.customStanceR = (int)msg.get("customStanceR");
		this.weight = (int)msg.get("weight");
		this.height = (int)msg.get("height");
		this.age = (int)msg.get("age");
		this.numOfRentalDays = (int)msg.get("numOfRentalDays");
		this.damageWaiver = (int)msg.get("damageWaiver");
		this.snowboard = (int)msg.get("snowboard");
	}

}
