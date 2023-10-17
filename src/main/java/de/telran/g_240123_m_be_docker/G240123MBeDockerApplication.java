package de.telran.g_240123_m_be_docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class G240123MBeDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(G240123MBeDockerApplication.class, args);
		System.out.println("HELLO FROM DOCKER APP!");
	}
}