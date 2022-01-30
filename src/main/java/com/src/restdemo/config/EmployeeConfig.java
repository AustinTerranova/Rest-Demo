package com.src.restdemo.config;

import assembler.EmployeeModelAssembler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeModelAssembler employeeModelAssembler(){
        return new EmployeeModelAssembler();
    }

}
