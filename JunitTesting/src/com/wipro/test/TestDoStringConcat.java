package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestDoStringConcat {
	DailyTasks obj = null;
	@Before
	public void setUp() throws Exception {
		obj = new DailyTasks();
	}

	@Test
	public void testDoStringConcat() {
		assertEquals("Hello World", obj.doStringConcat("Hello", "World"));
	}

}
