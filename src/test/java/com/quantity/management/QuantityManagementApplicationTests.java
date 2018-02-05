package com.quantity.management;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.quantity.management.entity.Quantity;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class QuantityManagementApplicationTests {

	@Autowired
	protected TestRestTemplate testRestTemplate;
	
	protected ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void testGetQuantity() throws Exception {
		String body = testRestTemplate.getForObject("/stock-availability/CI", String.class);
		
		Quantity quantity = mapper.readValue(body, Quantity.class);
		
		assertThat(quantity.getQuantity() != null);
	}

}
