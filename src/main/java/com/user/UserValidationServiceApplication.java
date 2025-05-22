package com.user;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class UserValidationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserValidationServiceApplication.class, args);
	}

	//@Bean
	public DataSource getConnection() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/college");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}
}
