package com.sureshrajuvetukuri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

@GetMapping("/zaidi")
	public String getData() {
		return "Welcome To My Running SpringAPP Final";
	}
}
