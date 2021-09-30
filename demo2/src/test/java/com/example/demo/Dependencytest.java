package com.example.demo;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Dependencytest {
	 
	@Autowired
	DataSource dataSource;
	
//	@Autowired
//	ApplicationContext applicationcontext;
	
	@Test
	public void Checktest()
	{
		assertNotNull(dataSource);
		
	}
	

}
