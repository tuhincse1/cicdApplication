package com.home.ci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.home.ci.cicdApplication.CiApplication;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CiApplication.class)
@WebAppConfiguration
public class CiApplicationTests {
	@Test
	public void contextLoads() {
	}

	@Test
	public void firstTest() throws Exception {
		assertEquals(1, 1);
	}
}