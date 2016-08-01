package com.http_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class post extends Thread{
	HttpClient client = HttpClients.createDefault();
	
	@Override
	public void run() {
		HttpPost post = new HttpPost("https://www.baidu.com");
		try {
			
			List<BasicNameValuePair> parameters = new ArrayList<>();
//			使用post方式传值
//			parameters.add(new BasicNameValuePair("name", "123"));
			
			
			post.setEntity(new UrlEncodedFormEntity(parameters,"UTF-8"));
			HttpResponse response = client.execute(post);
			HttpEntity entity = response.getEntity();
			
			String line = EntityUtils.toString(entity, "UTF-8");
			System.out.println(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
