package student;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.notification.Failure;

public class StudentTest {

	Failure fail;
	@Test
	public void test() {
	
		
		
		Student s = new Student();
		s.setGpa(4);
		s.setName("Bob");
		
		assertEquals(5, s.getGpa());
		
		
	}

}
