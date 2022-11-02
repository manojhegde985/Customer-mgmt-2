package customermgmtsystem.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import customermgmtsystem.entity.Customer;

@FeignClient(name="feign",url="http://localhost:8083/customer/")
public interface FeignClient1 {

	@GetMapping("/getAll")
	public List<Customer> getCustomer();

}
