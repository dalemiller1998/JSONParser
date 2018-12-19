package JSONParser;

import java.io.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Logger;

import javax.swing.text.html.HTMLEditorKit.Parser;


public class JSONparser {
	
	private static final Object Currentvalue = null;

	public void json(char c) {
		element(c);
	}
	
	public void value(char c) {
		if (c == '"') toString(c);
		readObject();
		readArray();
		readObject();
		toString();
		number();
		"true";
		"false";
		"null";
	}
	
	private void readArray() {
		// TODO Auto-generated method stub
		
	}

	

	public Object readObject() {
		return null;
	}
	
	public Object readArray() {
		return null;
	}
	
	public Class<Character> readString(char CurrentValue) {
		return null; 
				
	public char Currentvalue = 'x';
		StringBuilder theTextString = new StringBuilder();
		theTextString.append(Currentvalue);
		readObject();
	}
	
	public void number() {
		
	}
	
	public void element(char c) {
		//TODO
	}()
	
	
	public void continueNext() {
		try {
			Currentvalue = (char) reader.read();
		} catch (IOException ex)
		Logger.getLogger(Parser.class.getName())
		}
	}
	
	
	/*public Object readWhiteSpace() {
		while(){
			readObject();
		return null;}
	}*/
//	json
//    element
//
//value
//    object
//    array
//    string
//    number
//    "true"
//    "false"
//    "null"
//
//object
//    '{' ws '}'
//    '{' members '}'
//
//members
//    member
//    member ',' members
//
//member
//    ws string ws ':' element
//
//array
//    '[' ws ']'
//    '[' elements ']'
//
//elements
//    element
//    element ',' elements
//
//element
//    ws value ws
//
//string
//    '"' characters '"'
//characters
//    ""
//    character characters
//character
//    '0020' . '10ffff' - '"' - '\'
//    '\' escape
//escape
//    '"'
//    '\'
//    '/'
//    'b'
//    'n'
//    'r'
//    't'
//    'u' hex hex hex hex
//
//hex
//    digit
//    'A' . 'F'
//    'a' . 'f'
//
//number
//    int frac exp
//
//int
//    digit
//    onenine digits
//    '-' digit
//    '-' onenine digits
//
//digits
//    digit
//    digit digits
//
//digit
//    '0'
//    onenine
//
//onenine
//    '1' . '9'
//
//frac
//    ""
//    '.' digits
//
//exp
//    ""
//    'E' sign digits
//    'e' sign digits
//
//sign
//    ""
//    '+'
//    '-'
//
//ws
//    ""
//    '0009' ws
//    '000a' ws
//    '000d' ws
//    '0020' ws
}
