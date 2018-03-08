package com.watchman.registration;

import com.mastercard.apie.synapse.locus.LocusFramework;
import com.mastercard.apie.synapse.locus.exception.LocusFrameworkInitException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationApplication {

	public static void main(String[] args) throws LocusFrameworkInitException {
		SpringApplication.run(RegistrationApplication.class, args);
		LocusFramework.init();
	}
}
