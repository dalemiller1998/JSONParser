package JSONParser;
import java.io.Reader;

//File Reader
public class ReadJSONParser {
	public final Reader reader;

	public ReadJSONParser(Reader reader) {
		this.reader = reader;
	}

	public Symbol next() throws IOException {
		// TODO the lexical analysis!
		return null;
	}
}



