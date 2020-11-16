package com.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloImplTest {

	@Test
	void testHello() {
	//Arrange
	HelloImpl controller = new HelloImpl();
	
	//Act	
	String response= controller.hello("World");
	
	//Assert
	Assertions.assertEquals("Hello, World", response);

	}

}
