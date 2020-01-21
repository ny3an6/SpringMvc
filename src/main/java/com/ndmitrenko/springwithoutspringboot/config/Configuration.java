package com.ndmitrenko.springwithoutspringboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.ndmitrenko.springwithoutspringboot")
@org.springframework.context.annotation.Configuration
public class Configuration {

}
