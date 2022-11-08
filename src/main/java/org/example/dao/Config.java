package org.example.dao;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.dao")
@PropertySource("classpath:application.Properties")
public class Config {
}
