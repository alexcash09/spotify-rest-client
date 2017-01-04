package com.spotify.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.spotify.models.Artist;

public class Application {
	public static void main(String[] args) {
		String url = "https://api.spotify.com/v1/artists/7dGJo4pcD2V6oG8kP0tJRR";

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		try {
			// add accept request header
			request.addHeader("accept", "application/json");
			HttpResponse response = client.execute(request);

			System.out.println("Response Code : "
					+ response.getStatusLine().getStatusCode());
			
			Gson gson = new Gson();
			System.out.println(gson.fromJson(inputStreamToString(response.getEntity().getContent()), Artist.class));
			
			
			//System.out.println(inputStreamToString(response.getEntity().getContent()));

		} catch (UnsupportedOperationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


	}
	
	public static String inputStreamToString(InputStream in) throws IOException {
		BufferedReader rd;

		rd = new BufferedReader(
				new InputStreamReader(in));
		StringBuffer result = new StringBuffer();
		String line = "";

		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		
		return result.toString();
	}
}
