package com.thedevbridge;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@EnableMongoRepositories({"com.thedevbridge.model", "com.thedevbridge.repository"})
//@WebAppConfiguration
public class DemoApplicationTests {

	//@Test
	public void contextLoads() {
	}

}
