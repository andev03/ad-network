package com.adcompany.AD_Telecom;

import com.adcompany.AD_Telecom.dao.ServiceDAO;
import com.adcompany.AD_Telecom.model.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdNetworkApplication.class, args);
	}

}
