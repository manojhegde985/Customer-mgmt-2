package customermgmtsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import customermgmtsystem.entity.Customer;
import customermgmtsystem.feignclient.FeignClient1;
import customermgmtsystem.resttemplate.RestTempClass;
import customermgmtsystem.service.CustomerService;

@RequestMapping(value="/customer")
@RestController
public class Controller {

	@Autowired
	RestTempClass restTemp;
	
	@Autowired
	FeignClient1 feign;
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/getRestTemp")
	public ResponseEntity<List<Customer>>getAll(){
		List<Customer> customer=service.getAll();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/getFeign")
	public ResponseEntity<List<Customer>>getAllFeign(){
		List<Customer> customer=service.getCustomer();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
}
}
