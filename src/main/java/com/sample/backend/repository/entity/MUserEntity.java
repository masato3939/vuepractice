package com.sample.backend.repository.entity;

import lombok.Data;

@Data
public class MUserEntity {
  private int id;

  private String sei;

  private String mei;

  private int age;

  private String departmentCode;

  private int lengthOfService;
}
