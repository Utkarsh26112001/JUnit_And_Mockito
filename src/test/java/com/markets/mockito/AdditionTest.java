package com.markets.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class AdditionTest {


	@Test
	public void additionTest() {
		AdditionService service=mock(AdditionService.class); 
		Addition add= new Addition(service);
		
		when(service.addition(20, 30)).thenReturn(50);
		assertEquals(50,add.addition(20, 30));
	}
	

}
