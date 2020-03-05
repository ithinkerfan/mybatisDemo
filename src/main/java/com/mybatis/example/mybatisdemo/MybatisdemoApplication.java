package com.mybatis.example.mybatisdemo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mybatis.example.mybatisdemo.mapper.CityMapper;

@SpringBootApplication
public class MybatisdemoApplication implements CommandLineRunner {
  private final CityMapper cityMapper;

  public MybatisdemoApplication(CityMapper cityMapper) {
	    this.cityMapper = cityMapper;
  }
  
  public static void main(String[] args) {
    SpringApplication.run(MybatisdemoApplication.class, args);
  }

  @Override
  public void run(String... args) {
    System.out.println(this.cityMapper.findByState("CA"));
    this.cityMapper.newByState("xiaoming", "he", "CA");
    this.cityMapper.updByState("country");
    System.out.println(this.cityMapper.findByState("CA"));
    
  }

}