package com.sample.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sample.repository.entity.MUserEntity;

@Mapper
public interface MUserMapper {
  MUserEntity select(int id);
}
