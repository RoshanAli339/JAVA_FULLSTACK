package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	DailyTasks obj = null;
	
	@Before
	public void setUp() throws Exception {
		obj = new DailyTasks();
	}

	@Test
	public void testCheckPresence() {
		assertTrue(obj.checkPresence("Hello World", "ello"));
	}

}
