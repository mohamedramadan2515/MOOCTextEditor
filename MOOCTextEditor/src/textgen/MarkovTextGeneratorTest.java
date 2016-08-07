package textgen;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MarkovTextGeneratorTest {

	@Test
	public void test() {
		MarkovTextGenerator markov = new MarkovTextGeneratorLoL(new Random());
		markov.train("hi there hi Leo");
		assertEquals("hi: there->Leo->\nthere: hi->\nLeo: hi->\n", markov.toString());
	}

}
