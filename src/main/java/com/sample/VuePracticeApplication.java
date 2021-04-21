package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import com.fasterxml.jackson.databind.Module.SetupContext;

@SpringBootApplication
@ComponentScan
public class VuePracticeApplication implements CommandLineRunner {

  @Autowired JdbcTemplate jdbcTemplate;

  public static void main(String[] args) {
    SpringApplication.run(VuePracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    jdbcTemplate.execute(
        "CREATE TABLE customers(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

    jdbcTemplate.update("INSERT INTO customers(first_name, last_name) VALUES ('John','Woo')");
  }
}
