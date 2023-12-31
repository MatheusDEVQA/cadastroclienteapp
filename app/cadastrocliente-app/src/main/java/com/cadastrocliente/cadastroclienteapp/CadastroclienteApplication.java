package com.cadastrocliente.cadastroclienteapp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CadastroclienteApplication {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(CadastroclienteApplication.class, args);
    }

}
