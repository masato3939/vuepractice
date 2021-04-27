package com.sample.backend.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sample.backend.repository.entity.MUserEntity;

@Mapper
public interface MUserMapper {
  MUserEntity select(int id);
}
