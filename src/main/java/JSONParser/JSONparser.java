package JSONParser;

import java.io.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Logger;

import javax.swing.text.html.HTMLEditorKit.Parser;


public class JSONparser {
	
	private Reader reader;
		
	public JSONparser(Reader reader) {
		this.reader = reader;
	}

	public void json(char c) {
		element(c);
	}
	
	public void value(char c) {
		if (c == '"') readString(c);
		readObject();
		readArray1();
		readObject();
		readString();
		readNumber();
		readTrue();
		readFalse();
		readNull();
	}
	
	public void readArray1() {
		// TODO Auto-generated method stub
		
	}

	

	public Object readObject() {
		return null;
	}
		
	public Class<Character> readString(char CurrentValue) {
		return null;
	}
					
	public void readString() {
		
	}
	
	public void readNumber() {
		
	}
	
	public void readTrue() {
		
	}
	
	public void readFalse() {
		
	}

	public void readNull() {
	
}
	
	public void element(char c) {
		//TODO
	};
	
	public void continueNext() {
		try {
			char c = (char) reader.read();
			//TODO what do we do with this character?
		} catch (IOException ex) {
			System.err.println("Error: " + ex.getMessage());
		}
	}
	
	
	/*public Object readWhiteSpace() {
		while(){
			readObject();
		return null;}
	}*/
	
	
	
	
//Syntax
//json
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
