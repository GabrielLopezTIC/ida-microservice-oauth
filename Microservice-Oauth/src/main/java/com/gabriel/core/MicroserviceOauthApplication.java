package com.gabriel.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import com.gabriel.core.clientFeign.UsuarioClientFeing;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class MicroserviceOauthApplication implements CommandLineRunner{

    @Autowired
    UsuarioClientFeing usuarioClientFeign;
    
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	   //Optional<Usuario> usuario = usuarioClientFeign.findByEmail("gabriel@gmail.com");
	   //System.out.println("El usuario es: "+usuario.get().getEmail()); 
	}
  
	
}
