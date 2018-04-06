package jenkins.model;

import static org.junit.Assert.*;

//import org.junit.Test;

//import jenkins.model.IdStrategy.CaseSensitive;

public class IdStrategyTest {
	
	//@Test
	public void stringInRegex() {
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String input = "abd";
		String output = object.idFromFilename(input);
		System.out.println(output);
		assertEquals("abd", output);
	}
	
	//@Test
	public void stringNotInRegex() {
		IdStrategy.CaseSensitive object = new IdStrategy.CaseSensitive();
		String input = "\nok";
		String output = object.idFromFilename(input);
		System.out.println(output);
		assertEquals("ok", output);
	}

}
