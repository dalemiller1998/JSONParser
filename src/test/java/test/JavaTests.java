package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import JSONParser.HTTPPost;
import JSONParser.JSONparser;

class JavaTests {

	@Test
	void test() throws Exception {
		HTTPpost obj = new HTTPpost();
		obj.sendPost();
		fail("Not yet implemented");
	}

}
