package com.sample.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.backend.repository.entity.MUserEntity;
import com.sample.backend.service.SampleService;

@RestController
@RequestMapping(path = "/")
public class SampleController {
  @Autowired SampleService sampleService;

  @RequestMapping(path = "test")
  @GetMapping
  public MUserEntity test() {
    MUserEntity entity = sampleService.getTest(2);
    return entity;
  }
}
