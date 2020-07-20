package order.service;
import org.springframework.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

Public Class OrderApplication{

public static void main(String args[]){


SpringApplication.run(OrderApplication.class,args);


}


}