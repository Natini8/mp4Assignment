package jenkins.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IdStrategyTest {
	
	@Test
	public void inputRegex() {
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String input = "abc";
		String output = object.idFromFilename(input);
		assertEquals("abc", output);
	}
	
	@Test
	public void inputNotInRegex() {
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String input = "\nabc";
		String output = object.idFromFilename(input);
		assertEquals("abc", output);
	}

}
