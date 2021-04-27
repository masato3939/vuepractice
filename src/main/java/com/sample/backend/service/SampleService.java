package com.sample.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.backend.repository.entity.MUserEntity;
import com.sample.backend.repository.mapper.MUserMapper;

@Service
public class SampleService {
  @Autowired MUserMapper mapper;

  public MUserEntity getTest(int id) {
    return mapper.select(id);
  }
}
