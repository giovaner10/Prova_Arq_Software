package br.cesed.si.arquitetura.nelsonrubens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NelsonrubensApplication {

	public static void main(String[] args) {
		SpringApplication.run(NelsonrubensApplication.class, args);
	}

}
