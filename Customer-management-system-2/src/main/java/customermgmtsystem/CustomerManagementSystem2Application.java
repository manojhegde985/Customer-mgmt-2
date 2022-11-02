package customermgmtsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class CustomerManagementSystem2Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSystem2Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
	return new RestTemplate();
	}
}
