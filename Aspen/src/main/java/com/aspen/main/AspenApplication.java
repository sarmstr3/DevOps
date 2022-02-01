package com.aspen.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AspenApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(AspenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO users (fullname, email, password) VALUES (?, ?, ?)";
		int result = jdbcTemplate.update(sql, "Sterling", "sterlingarmstrong14@gmail.com", "sarmstrong");
		
		if(result > 0) {
			 System.out.println("New row has been inserted.");
		}
	}

}
