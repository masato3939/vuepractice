package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.repository.entity.MUserEntity;
import com.sample.service.SampleService;

@RestController
@RequestMapping(path = "/")
public class SampleController {
  @Autowired SampleService sampleService;

  @RequestMapping(path = "test")
  @GetMapping
  public MUserEntity test(@RequestParam("id") int id) {
    MUserEntity entity = sampleService.getTest(id);
    return entity;
  }
}
