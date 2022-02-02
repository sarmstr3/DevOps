package com.aspen.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspen.main.orm.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	String findByPhoneNumber(String phoneNumber);
}
