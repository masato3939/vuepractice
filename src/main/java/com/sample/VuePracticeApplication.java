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
public class VuePracticeApplication {

  @Autowired JdbcTemplate jdbcTemplate;

  public static void main(String[] args) {
    SpringApplication.run(VuePracticeApplication.class, args);
  }
}
