package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import JSONParser.HTTPpost;
import JSONParser.JSONparser;
import java.io.IOException;

class JavaTests {

	@Test
	void test() throws Exception {
		HTTPpost obj = new HTTPpost();
		obj.sendPost();
		fail("Not yet implemented");
	}
}