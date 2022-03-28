package br.cesed.si.arquitetura.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CarrinhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoApplication.class, args);
	}

//	eureka:
//	client:
//	serviceUrl:
//	defaultZone: ${vcap.services.eureka-service.credentials.uri:http://192.168.0.102:8761}/eureka/

}
