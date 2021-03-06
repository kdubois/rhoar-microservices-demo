package org.meetup.openshift.rhoar.customers.service;

import javax.enterprise.context.ApplicationScoped;

import org.meetup.openshift.rhoar.customers.model.Customer;
import org.meetup.openshift.rhoar.customers.repository.CustomerRepository;

import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockCustomerRepository extends CustomerRepository {
	
	@Override
	public Customer findById(Long id) {
		Customer c = null;
		if (id.equals(1L)) {
			c = new Customer();
			c.setId(1L);
			c.setUsername("mockusername");
			c.setName("Test User Mock");
			c.setSurname("Test Surname Mock");
			c.setAddress("Test Address Mock");
			c.setCity("Test City Mock");
			c.setCountry("Test Country Mock");
			c.setZipCode("MOCKZIP");
		}		
		return c;
	}

}
