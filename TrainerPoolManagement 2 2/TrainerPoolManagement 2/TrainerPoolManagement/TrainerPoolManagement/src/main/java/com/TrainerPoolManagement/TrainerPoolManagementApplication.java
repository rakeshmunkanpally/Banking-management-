package com.TrainerPoolManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.TrainerPoolManagement.Models.DAO.ImplService.TrainerDetailBL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication
public class TrainerPoolManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainerPoolManagementApplication.class, args);
	}

	@Bean
	public TrainerDetailBL detailBL() {

		return new TrainerDetailBL();
	}

}
