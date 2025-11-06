package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.TimeZone;

@SpringBootTest
@TestPropertySource(properties = {
	"spring.datasource.url=jdbc:postgresql://localhost:5432/flowers",
	"spring.datasource.username=postgres",
	"spring.datasource.password=postgres"
})
class DemoApplicationTests {

	static {
		// Set timezone before Spring context loads
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	@Test
	void contextLoads() {
	}

}
