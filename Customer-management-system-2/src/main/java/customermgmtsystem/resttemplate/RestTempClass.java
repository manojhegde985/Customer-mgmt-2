package customermgmtsystem.resttemplate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import customermgmtsystem.entity.Customer;

@Component
public class RestTempClass {
	private static final String GET_ALL="http://localhost:8083/customer/getAll";
	
	@Autowired
	private RestTemplate restTemplate;

	public List<Customer> getCustomers()
	{
	Customer[] objects = restTemplate.getForObject(GET_ALL, Customer[].class);
	return Arrays.asList(objects);
	}
}
