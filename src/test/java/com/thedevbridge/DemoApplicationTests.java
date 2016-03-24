package com.thedevbridge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@EnableMongoRepositories({"com.thedevbridge.model", "com.thedevbridge.repository"})
@WebAppConfiguration
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
