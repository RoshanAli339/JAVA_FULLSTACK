package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCheckPresence.class, TestDoStringConcat.class, TestSort.class })
public class DailyTasksTest {

}
