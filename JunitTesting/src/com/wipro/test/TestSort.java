package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	DailyTasks obj = null;
	@Before
	public void setUp() throws Exception {
		obj = new DailyTasks();
	}

	@Test
	public void testSortValues() {
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, obj.sortValues(new int[] {5, 4, 3, 2, 1}));
	}

}
