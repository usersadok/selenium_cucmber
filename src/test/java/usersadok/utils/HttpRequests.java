package usersadok.utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequests {
	private static final String USER_AGENT = "Mozilla/5.0";

	public int codeGetRequest(String GET_URL) throws IOException {
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		return con.getResponseCode();
	}
}
