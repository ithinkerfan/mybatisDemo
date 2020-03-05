package com.mybatis.example.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.mybatis.example.mybatisdemo.domain.City;


/**
 * @author Edd�� Mel��ndez
 */
@Mapper
public interface CityMapper {

  @Select("select id, name, state, country from city where state = #{state}")
  City findByState(@Param("state") String state);
  
  
  @Insert("insert into city (name, state, country) values (#{name}, #{state}, #{country})")
  City newByState(@Param("name") String name,@Param("state") String state,@Param("country") String country);
  
  @Update("update city set country=#{country} where id =1")
  City updByState(@Param("country") String country);
}