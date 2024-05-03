package com.patrondto.footballers;

import com.patrondto.footballers.conexion.DatabaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class FootballersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FootballersApplication.class, args);
		DatabaseService databaseService = context.getBean(DatabaseService.class);
		try {
			databaseService.testConnection();
		} catch (SQLException e) {
			System.out.println("Error al intentar conectarse a la base de datos: " + e.getMessage());
		}
	}

}
