package co.chrisman.lbsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LbSampleApplication {

	static String serviceName;

	public static void main(String[] args) {
		serviceName = args[0];
		SpringApplication.run(LbSampleApplication.class, args);
	}


	@GetMapping("/hello/{name}")
	String hello(@PathVariable String name) {
		System.out.println(">> invoked with: " + name);
		return String.format("Hello %s, from %s", name, serviceName);
	}
}
