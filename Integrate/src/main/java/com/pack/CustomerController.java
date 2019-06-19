package com.pack;

import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.form.Customer;
import com.pack.service.CustomerService;

@Controller
public class CustomerController {
private static Logger log=Logger.getLogger(CustomerController.class);
private CustomerService customerService;
@Autowired
@Qualifier(value="customerService")
public void setCustomerService(CustomerService customerService) {
	this.customerService = customerService;
}

@RequestMapping(value="/index")
public String listCustomer(Map<String, Object> map) {
	map.put("customer", new Customer());
	map.put("customerList",customerService.listCustomer());
	log.info("Inside list Customer");
	
	return "customer";
	}

@RequestMapping(value="/customer/add", method=RequestMethod.POST)
public String addCustomer(@ModelAttribute("customer") @Validated Customer customer, BindingResult bindingResult,Model model)
{
	if(bindingResult.hasErrors()) {
		log.info("Validation Error");
		model.addAttribute("customerList",customerService.listCustomer());
		return "customer";
	}
	else {
		
		if(null==customer.getId()) {
			Random rand=new Random();
			int num=rand.nextInt(9000000)+1000000;
			customer.setId(num);
			log.info("Inside Add Customer");
			customerService.addCustomer(customer);
		}
		else {
			log.info("Before Update Customer");
			customerService.updateCustomer(customer);
			
		}
	}
	return "redirect:/index";
}
@RequestMapping("/edit/{customerId}")
public String editCustomer(@PathVariable("customerId")Integer cid, Map<String,Object> map)
{
map.put("customer", customerService.getCustomerById(cid));
log.info("Getting details for customer Id"+cid);
map.put("customerList", customerService.listCustomer());
log.info("Retrieving customer info");
return "customer";

}
@RequestMapping("/delete/{customerId}")
public String deleteCustomer(@PathVariable("customerId") Integer customerId)
{
	customerService.removeCustomer(customerId);
	log.info("Deleting info"+customerId);
	return "redirect:/index";
}
}
