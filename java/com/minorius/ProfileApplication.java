package com.minorius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;


@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) throws FileNotFoundException {

		SpringApplication.run(ProfileApplication.class, args);

	}
}
