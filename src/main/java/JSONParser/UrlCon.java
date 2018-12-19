package JSONParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlCon {	
	
	public static void main(String[] args) throws Exception{
		
		UrlCon http = new UrlCon();
		
		System.out.println("Sending GET request");
		http.sendGet();
		
		}

	private void sendGet() throws Exception{
		URL connection = new URL ("http://i2j.openode.io/student?id=s195390");
		HttpURLConnection con = (HttpURLConnection) connection.openConnection();
		
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		int responseCode = con.getResponseCode();
		System.out.println("Response Code : "+ responseCode);
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
	
		while ((inputLine = in.readLine()) != null){
			response.append(inputLine);
			}
		in.close();
	System.out.println(response.toString());
		}
}