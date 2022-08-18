package com.bookingservices.booking.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServicesApplication.class, args);
	}

}
