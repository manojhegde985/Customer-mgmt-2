package customermgmtsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customermgmtsystem.entity.Customer;
import customermgmtsystem.feignclient.FeignClient1;
import customermgmtsystem.resttemplate.RestTempClass;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	RestTempClass restTemp;
	
	@Autowired
	FeignClient1 feign;

	@Override
	public List<Customer> getAll() {
		return restTemp.getCustomers();
	}

	@Override
	public List<Customer> getCustomer() {
		return feign.getCustomer();
	}
	
}
