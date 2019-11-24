/**
 * jUnit test cases to test the number to word conversion..
 */


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Ayan
 *
 */
public class AppTest {

	@Test
	public void test0() {
		long givenNumber = 999999999;
		assertEquals("ninety nine crore ninety nine lakh ninety nine thousand nine hundred and ninety nine", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test1() {
		long givenNumber = 1111111;
		assertEquals("eleven lakh eleven thousand one hundred and eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test2() {
		long givenNumber = 111111;
		assertEquals("one lakh eleven thousand one hundred and eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test3() {
		long givenNumber = 11111;
		assertEquals("eleven thousand one hundred and eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test4() {
		long givenNumber = 1111;
		assertEquals("one thousand one hundred and eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test5() {
		long givenNumber = 111;
		assertEquals("one hundred and eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test6() {
		long givenNumber = 11;
		assertEquals("eleven", App.conv2word(givenNumber).trim());
	}
	
	@Test
	public void test7() {
		long givenNumber = 1;
		assertEquals("one", App.conv2word(givenNumber).trim());
	}


}
