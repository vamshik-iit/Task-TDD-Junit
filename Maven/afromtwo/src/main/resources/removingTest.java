import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vamshi.Removea;

import junit.framework.TestCase;

public class removingTest extends TestCase {
	removing a;
	@BeforeEach
	void setUp()
	{
		a= new removing();
	}
	
	@Test
	void testremove() {
				assertEquals("bcd",a.removing("aabcd"));
			}
	@Test
	void testremove1() {
	     		assertEquals("bcbcd",a.removing("bcbcd"));
			}
	@Test
	void testremove2() {
				assertEquals("bbcd",a.removing("abbcd"));
			}
	@Test
	void testremove3() {
				assertEquals("",a.removing("aa"));
			}
	@Test
	void testremove4() {
				assertEquals("Empty String",a.removing(""));
			}


}
